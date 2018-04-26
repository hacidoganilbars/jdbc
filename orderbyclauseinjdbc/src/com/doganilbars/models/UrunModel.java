package com.doganilbars.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entities.Urun;

public class UrunModel {

	public enum Direction {
		ASC, DESC
	}

	public List<Urun> orderBy(Direction direction) {

		List<Urun> urunler = new ArrayList<Urun>();

		try {
			PreparedStatement preparedStatement = null;
			if (direction == Direction.ASC) {
				preparedStatement = VeritabaniBaglantisi.getConnection()
						.prepareStatement("select * from urun order by  fiyat asc");
			} else if (direction == Direction.DESC) {
				preparedStatement = VeritabaniBaglantisi.getConnection()
						.prepareStatement("select * from urun order by fiyat desc");
			}
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
