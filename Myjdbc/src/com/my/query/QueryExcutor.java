package com.my.query;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.my.connection.DataBaseConnection;
import com.my.helper.StudentHelper;
import com.my.info.StudentVo;
import com.mysql.cj.protocol.Resultset;

public class QueryExcutor {
	static String query="Select *from Zafar_1 where customerId=1";
	public static void  main(String []a)
	{
		QueryExcutor q=new QueryExcutor();
		StudentVo stud=q.excutequ(query);
		System.out.print("  " +stud.getSno());
		System.out.print("  " +stud.getStudentName());
		System.out.print("  " +stud.getCity());
		System.out.print("  " +stud.getPhoneNumber());
		
	}
	
	public StudentVo excutequ(String query)
	{
		ResultSet result=null;
		Statement stm=null;
		DataBaseConnection data=new DataBaseConnection();
		Connection connection=data.getConnection();
		//Object obj=null;
		StudentVo std=null;
		try {
			stm=connection.createStatement();
			result=stm.executeQuery(query);
			StudentHelper stud=new StudentHelper();
			std=new StudentVo();
			std=stud.takeDatafromResultsetAndPutStudentVo( result);
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try 
			{
				if(result!=null)
				{
					result.close();
				}
				if(stm!=null)
				{
					stm.close();
				}
			
			}
		catch(Exception e)
		{
		}
			if(connection!=null) {
				System.out.println("not null ");
				data.releaseDataBaseConnection(connection);
			}
		}
		return std;
	}
}
