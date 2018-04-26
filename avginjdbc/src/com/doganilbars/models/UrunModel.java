package com.doganilbars.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UrunModel {

	public double avg() {
		double result = 0;
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select avg(fiyat) from urun");
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			result = resultSet.getDouble(1);

		} catch (Exception e) {
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

}
