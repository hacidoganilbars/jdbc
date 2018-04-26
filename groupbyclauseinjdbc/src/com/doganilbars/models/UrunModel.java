package com.doganilbars.models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doganilbars.entities.Grup;

public class UrunModel {

	public List<Grup> groupBy() {
		List<Grup> gruplar = new ArrayList<Grup>();
		try {
			PreparedStatement preparedStatement = VeritabaniBaglantisi.getConnection().prepareStatement(
					"select ureticiFirma, min(fiyat) as minFiyat,max(fiyat) as maxFiyat, sum(miktar) as sumMiktar, count(id) as countUrun,avg(fiyat) as avgFiyat from urun group by ureticiFirma");
			ResultSet resultSet = preparedStatement.executeQuery();
			Grup grup;
			while (resultSet.next()) {
				grup = new Grup();
				grup.setUreticiFirma(resultSet.getString("ureticiFirma"));
				grup.setMinFiyat(resultSet.getBigDecimal("minFiyat"));
				grup.setMaxFiyat(resultSet.getBigDecimal("maxFiyat"));
				grup.setSumMiktar(resultSet.getInt("sumMiktar"));
				grup.setCountUrun(resultSet.getInt("countUrun"));
				grup.setAvgFiyat(resultSet.getDouble("avgFiyat"));
				gruplar.add(grup);
			}
		} catch (Exception e) {
			gruplar = null;
			e.printStackTrace();
		}
		return gruplar;
	}

}
