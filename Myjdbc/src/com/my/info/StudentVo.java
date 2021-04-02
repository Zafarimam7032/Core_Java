package com.my.info;

public class StudentVo {

	private int sno;
	private String studentName;
	private String city;
	private String phoneNumber;
	public void  setSno(int sno)
	{
		this.sno=sno;
	}
	public int getSno()
	{
		return sno;
	}
	public void setStudentName(String studentName) 
	{
		this.studentName=studentName;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}

//	public static void main(String []args)
//	{
//		StudentVo vo=new StudentVo();
//		vo.setSno(10);
//		int a=vo.getSno();
//		System.out.println(a);
//	}
}