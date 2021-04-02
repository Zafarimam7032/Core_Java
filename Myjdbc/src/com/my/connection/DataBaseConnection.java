package com.my.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
	final static String dataBaseName="greattug_gw_pratice_CD";
	final static String userName="greattug_pratice";
	final static String password="Test1234##";
	final static String port="3306";
	final static String ipAdress="103.50.160.116";
	final static String dataBaseUrl="jdbc:mysql://"+ipAdress+":"+port+"/"+dataBaseName;
	final static String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	public Connection getConnection()
	{
		Connection con=null;
		try {
		Class.forName(DRIVER_CLASS);
		con=DriverManager.getConnection(dataBaseUrl,userName,password);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return con;
	}
	public boolean releaseDataBaseConnection(Connection con)
	{
		boolean check=false;
		if(con!=null) 
		{
			try 
			{
			con.close();
			check=true;
			
			}
			catch(Exception e)
			{
				System.out.println("issue to colose connection");
			}
		}
		else 
		{
			System.out.println("keya yaar connection check karo null hai");
		}
		
		return check;
	}
//		public static void main(String args[])
//		{
//			DataBaseConnection conect=new DataBaseConnection();
//			Connection cont=conect.getConnection();
//			if(cont==null)
//			{
//				System.out.println("Connection is null yaar check karo thik se ");
//			}
//			else 
//			{
//				System.out.println("good job bro connection established enjoy karo");
//			}
//		}
	
	
	
}
class DataBaseCheck
{
	public static void main(String [] a) {
		DataBaseConnection conect=new DataBaseConnection();
		Connection cont=conect.getConnection();
		if(cont==null)
		{
			System.out.println("Connection is null yaar check karo thik se ");
		}
		else 
		{
			System.out.println("good job bro connection established enjoy karo");
		}
	}
}


