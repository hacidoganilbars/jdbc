package com.doganilbars.models;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UrunModel {

	public BigDecimal min() {
		BigDecimal result = null;
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select min(fiyat) from urun");
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			result = resultSet.getBigDecimal(1);
		} catch (Exception e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	public BigDecimal max() {
		BigDecimal result = null;
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select max(fiyat) from urun");
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			result = resultSet.getBigDecimal(1);
		} catch (Exception e) {
			result = null;
			e.printStackTrace();
		}
		return result;
	}

}
