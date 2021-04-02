package com.gw.ecom.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

class ConnectionUtilMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ConnectionUtil.DB_URL_STATEMENT);
		ConnectionUtil connectionUtil = new ConnectionUtil();
		Connection connection = connectionUtil.getConnection();
		if (connection != null) {
			System.out.println("connection is not null");
			connectionUtil.releaseDBConnection(connection);
		} else {
			System.out.println("connection is null");
			connectionUtil.releaseDBConnection(connection);
		}
	}

}

public class ConnectionUtil {

	final static String DB_NAME = "greattug_gw_pratice_CD";
	final static String DB_USERNAME = "greattug_pratice";
	final static String DB_PASSWORD = "Test1234##";
	final static String DB_PORT = "3306";
	final static String DB_IP = "103.50.160.116";
	final static String DB_URL_STATEMENT = "jdbc:mysql://" + DB_IP + ":" + DB_PORT + "/" + DB_NAME;
	final static String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";

	public Connection getConnection() {
		Connection connection = null;
		// String sql = "select * from emp";
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(DB_URL_STATEMENT, DB_USERNAME, DB_PASSWORD);
		} catch (Exception e) {
			System.out.println(e);
		}
		return connection;
	}

	public boolean releaseDBConnection(Connection connection) {
		boolean result = false;
		if (connection != null) {
			try {
				connection.close();
				result = true;
			} catch (Exception exception) {
				System.out.println("Issue in closing connnction");
				result = false;
			}
			

		}else {
			System.out.println("Gadhe connection null bhejta hai?");
			
		}
		return result;
	}

}
