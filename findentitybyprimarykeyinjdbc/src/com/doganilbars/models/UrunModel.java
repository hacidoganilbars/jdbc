package com.doganilbars.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.doganilbars.entities.Urun;

public class UrunModel {

	public Urun find(int id) {
		Urun urun = null;
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select * from urun where id = ?");
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				urun = new Urun();
				urun.setId(resultSet.getInt("id"));
				urun.setIsim(resultSet.getString("isim"));
				urun.setFiyat(resultSet.getBigDecimal("fiyat"));
				urun.setMiktar(resultSet.getInt("miktar"));
				urun.setAciklama(resultSet.getString("aciklama"));
				urun.setOzellik(resultSet.getBoolean("ozellikli"));
				urun.setImalatTarihi(resultSet.getDate("imalatTarihi"));
			}

		} catch (Exception e) {
			urun = null;
			e.printStackTrace();
		}
		return urun;
	}

}
