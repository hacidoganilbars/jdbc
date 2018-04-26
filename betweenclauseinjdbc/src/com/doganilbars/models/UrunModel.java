package com.doganilbars.models;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entities.Urun;

public class UrunModel {

	public List<Urun> between(BigDecimal min, BigDecimal max) {

		List<Urun> urunler = new ArrayList<Urun>();
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select * from urunbilgiler.urun where fiyat between ? and ?");
			preparedStatement.setBigDecimal(1, min);
			preparedStatement.setBigDecimal(2, max);
			ResultSet resultSet = preparedStatement.executeQuery();
			Urun urun;
			while (resultSet.next()) {
				urun = new Urun();
				urun.setId(resultSet.getInt("id"));
				urun.setIsim(resultSet.getString("isim"));
				urun.setFiyat(resultSet.getBigDecimal("fiyat"));
				urun.setAciklama(resultSet.getString("aciklama"));
				urun.setMiktar(resultSet.getInt("miktar"));
				urun.setOzellik(resultSet.getBoolean("ozellikli"));
				urun.setImalatTarihi(resultSet.getDate("imalatTarihi"));
				urunler.add(urun);
			}

		} catch (Exception e) {
			urunler = null;
		}
		return urunler;
	}

}
