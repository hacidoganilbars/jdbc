package com.doganilbars.models;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entities.Urun;

public class UrunModel {

	public List<Urun> between(BigDecimal min, BigDecimal max) {
		List<Urun> urunler = new ArrayList<Urun>();
		try {
			CallableStatement callableStatement = VeritabaniBaglantisi.getConnection()
					.prepareCall("{call findBetween(?,?)}");
			callableStatement.setBigDecimal(1, min);
			callableStatement.setBigDecimal(2, max);
			ResultSet resultSet = callableStatement.executeQuery();
			Urun urun;
			while (resultSet.next()) {
				urun = new Urun();
				urun.setId(resultSet.getInt("id"));
				urun.setIsim(resultSet.getString("isim"));
				urun.setFiyat(resultSet.getBigDecimal("fiyat"));
				urun.setMiktar(resultSet.getInt("miktar"));
				urun.setAciklama(resultSet.getString("aciklama"));
				urun.setImalatTarihi(resultSet.getDate("imalatTarihi"));
				urun.setOzellik(resultSet.getBoolean("ozellikli"));
				urunler.add(urun);
			}
		} catch (Exception e) {
			urunler = null;
			e.printStackTrace();
		}
		return urunler;

	}

}
