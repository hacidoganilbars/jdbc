package com.doganilbars.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UrunModel {

	public int count() {
		int result = 0;
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select count(id) from urun");
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			result = resultSet.getInt(1);

		} catch (Exception e) {
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

}
