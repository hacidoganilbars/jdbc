package com.doganilbars.models;

import java.sql.PreparedStatement;

public class UrunModel {

	public boolean delete(int id) {
		boolean result = true;

		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("delete from urun where id=?");
			preparedStatement.setInt(1, id);
			result = preparedStatement.executeUpdate() > 0;
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		}
		return result;
	}

}
