package com.my.studentDao;
//import java.sql.Statement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Connection;

import com.my.info.StudentVo;
import com.my.query.QueryExcutor;

public class StudentDAO {
	 static String query="Select *from Zafar_1";
	public static void main(String[] args) throws SQLException 
	{
		StudentDAO Dao=new StudentDAO();
		//StudentVo stud;
		StudentVo stud=Dao.getById();
		System.out.print("  " +stud.getSno());
		System.out.print("  " +stud.getStudentName());
		System.out.print("  " +stud.getCity());
		System.out.print("  " +stud.getPhoneNumber());
		
	}
	public StudentVo getById() 
	{
	
		System.out.println(query);
		//StudentVo s=new StudentVo();
		QueryExcutor queryexe=new QueryExcutor();
		StudentVo stvo=queryexe.excutequ(query);
		return stvo ;
	}
	

}
