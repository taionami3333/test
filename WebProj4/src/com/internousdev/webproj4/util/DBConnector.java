package com.internousdev.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	/**
	 * JDBC driver name
	 */
	private static String driverName="com.mysql.jdbc.Driver";
	/**
	 * DB url
	 */
	private static String url="jdbc:mysql://localhost/testdb";
	/**
	 * DB username
	 */
	private static String user="root";
	/**
	 *DB password
	 */
	private static String password="mysql";

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
