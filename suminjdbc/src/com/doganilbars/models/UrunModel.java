package com.doganilbars.models;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UrunModel {

	public int sumMiktar() {
		int result = 0;

		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select sum(miktar) from urun");
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			result = resultSet.getInt(1);
		} catch (Exception e) {
			result = 0;
			e.printStackTrace();
		}
		return result;
	}

	public BigDecimal toplam() {
		BigDecimal result = null;

		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection()
					.prepareStatement("select sum(fiyat*miktar) from urun");
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
