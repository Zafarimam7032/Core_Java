package com.my.helper;

import java.sql.ResultSet;

import com.my.info.StudentVo;

public class StudentHelper {
	
	public StudentVo takeDatafromResultsetAndPutStudentVo(ResultSet result)
	{
		StudentVo stud=null;
		try
		{
			if(result!=null)
			{
				stud=new StudentVo();
				stud.setSno(result.getInt("sno"));
				stud.setStudentName(result.getString("StudentName"));
				stud.setCity(result.getString("city"));
				stud.setPhoneNumber(result.getString("phoneNumber"));
			}
		}
		catch(Exception e)
		{
			
		}
	
	return stud;
	}

}
