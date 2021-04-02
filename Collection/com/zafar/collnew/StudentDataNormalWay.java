package com.zafar.collnew;

public class StudentDataNormalWay {
	static StudentVo obj[]=new StudentVo[10];
	StudentVo studentvo;
	
	public void insert()
	{ 
		
		
		studentvo =new StudentVo();
		studentvo.setName("zafar imam");
		studentvo.setCity("New Delhi");
		studentvo.setAge(21);
		studentvo.setPhoneNumber("+917032871006");
		obj[0]=studentvo;
	//studentvo=null;
		studentvo=new StudentVo();
		studentvo.setName("Shobhit");
		studentvo.setCity("old Delhi");
		studentvo.setAge(25);
		studentvo.setPhoneNumber("+1234271006");
		obj[1]=studentvo;
		
	}
	public static void main(String[] args) {
		StudentDataNormalWay objj1=new StudentDataNormalWay();
		objj1.insert();
		System.out.println(obj[0].getName());
		System.out.println(obj[0].getCity());
		System.out.println(obj[0].getAge());
		System.out.println(obj[0].getPhoneNumber());
		System.out.println("================================================================");
		System.out.println(obj[1].getName());
		System.out.println(obj[1].getCity());
		System.out.println(obj[1].getAge());
		System.out.println(obj[1].getPhoneNumber());
			}
	
}
