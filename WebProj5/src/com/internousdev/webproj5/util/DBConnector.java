package com.internousdev.webproj5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	/**
	 * db driver name
	 */
	private static String driverName = "com.mysql.jdbc.Driver";
	/**
	 * db url
	 */
	private static String url = "jdbc:mysql://localhost/testdb";
	/**
	 * db username
	 */
	private static String user="root";
	/**
	 * db password
	 */
	private static String password ="mysql";

	public Connection getConnection(){
		Connection con = null;
		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
