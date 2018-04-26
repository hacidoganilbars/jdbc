package com.doganilbars.models;

import java.sql.Date;
import java.sql.PreparedStatement;

import com.doganilbars.entity.Urun;

public class UrunModel {

	public boolean create(Urun urun) {
		boolean result = true;
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection().prepareStatement(
					"insert into urun(isim,fiyat,miktar,aciklama,ozellikli,imalatTarihi) values(?,?,?,?,?,?)");
			preparedStatement.setString(1, urun.getIsim());
			preparedStatement.setBigDecimal(2, urun.getFiyat());
			preparedStatement.setInt(3, urun.getMiktar());
			preparedStatement.setString(4, urun.getAciklama());
			preparedStatement.setBoolean(5, urun.isOzellik());
			preparedStatement.setDate(6, new Date(urun.getImalatTarihi().getTime()));
			result = preparedStatement.executeUpdate() > 0;
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

}
