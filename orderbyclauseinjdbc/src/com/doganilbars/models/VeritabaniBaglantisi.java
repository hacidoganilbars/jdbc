package com.doganilbars.models;

import java.sql.Connection;
import java.sql.DriverManager;

public class VeritabaniBaglantisi {

	public static Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/urunbilgiler", "root", "8124782.Aa");
		} catch (Exception e) {
			connection = null;
			e.printStackTrace();
		}
		return connection;
	}

}
