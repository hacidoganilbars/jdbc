package com.doganilbars.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entities.Urun;

public class UrunModel {

	public List<Urun> limit(int offset, int count) {

		List<Urun> urunler = new ArrayList<Urun>();
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select * from urun limit ?, ?");
			preparedStatement.setInt(1, offset);
			preparedStatement.setInt(2, count);
			ResultSet resultSet = preparedStatement.executeQuery();
			Urun urun;
			while (resultSet.next()) {
				urun = new Urun();
				urun.setId(resultSet.getInt("id"));
				urun.setIsim(resultSet.getString("isim"));
				urun.setFiyat(resultSet.getBigDecimal("fiyat"));
				urun.setMiktar(resultSet.getInt("miktar"));
				urun.setAciklama(resultSet.getString("aciklama"));
				urun.setOzellik(resultSet.getBoolean("ozellikli"));
				urun.setImalatTarihi(resultSet.getDate("imalatTarihi"));
				urunler.add(urun);
			}

		} catch (Exception e) {
			urunler = null;
			e.printStackTrace();
		}
		return urunler;
	}

}
