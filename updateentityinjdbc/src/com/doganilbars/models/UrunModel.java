package com.doganilbars.models;

import java.sql.Date;
import java.sql.PreparedStatement;

import com.doganilbars.entities.Urun;

public class UrunModel {

	public boolean update(Urun urun) {
		boolean result = true;
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection().prepareStatement(
					"update urun set isim=?, fiyat=?, miktar=?, aciklama=?, ozellikli=?, imalatTarihi=? where id=?");
			preparedStatement.setString(1, urun.getIsim());
			preparedStatement.setBigDecimal(2, urun.getFiyat());
			preparedStatement.setInt(3, urun.getMiktar());
			preparedStatement.setString(4, urun.getAciklama());
			preparedStatement.setBoolean(5, urun.isOzellik());
			preparedStatement.setDate(6, new Date(urun.getImalatTarihi().getTime()));
			preparedStatement.setInt(7, urun.getId());
			result = preparedStatement.executeUpdate() > 0;
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

}
