package com.zafar.collnew;

import java.util.ArrayList;

public class InseartViaArrayObject {
	 static  StudentVo []studentVo1=new StudentVo[3];
	 ArrayList<StudentVo> studentVo11;
	public void inseart()
	{
		  StudentVo []studentVo=new StudentVo[3];
		  studentVo[0]=new StudentVo();
		  studentVo[0].setName("Zafar Imam");
		  studentVo[0].setCity("New Delhi");
		  studentVo[0].setAge(22);
		  studentVo[0].setPhoneNumber("+917032871006");
		  studentVo1[0]=studentVo[0];
		  StudentVo studentVo11=new StudentVo();
		  studentVo11=new StudentVo();
		  studentVo11.setName("Rehan Khan");
		  studentVo11.setCity("Delhi");
		  studentVo11.setAge(22);
		  studentVo11.setPhoneNumber("+917871006");
		  studentVo1[1]=studentVo11;

		  studentVo[2]=new StudentVo();
		  studentVo[2].setName("Ateef eqbal");
		  studentVo[2].setCity("Delhi");
		  studentVo[2].setAge(10);
		  studentVo[2].setPhoneNumber("+917232871006");
		  studentVo1[2]=studentVo[2];

		  
		  
	}
	public ArrayList<StudentVo> inseart1()
	{
		studentVo11=new ArrayList<StudentVo>();
		StudentVo []studentVo=new StudentVo[3];
		  studentVo[0]=new StudentVo();
		  studentVo[0].setName("Zafar Imam");
		  studentVo[0].setCity("New Delhi");
		  studentVo[0].setAge(22);
		  studentVo[0].setPhoneNumber("+917032871006");
		  studentVo11.add(studentVo[0]);
		  StudentVo studentVo111=new StudentVo();
		  studentVo111=new StudentVo();
		  studentVo111.setName("Rehan Khan");
		  studentVo111.setCity("Delhi");
		  studentVo111.setAge(22);
		  studentVo111.setPhoneNumber("+917871006");
		 
		  studentVo11.add(studentVo111);
		  StudentVo studentVo2=new StudentVo();
		  studentVo2=new StudentVo();
		  studentVo2.setName("Ateef eqbal");
		  studentVo2.setCity("Delhi");
		  studentVo2.setAge(10);
		  studentVo2.setPhoneNumber("+917232871006");
		  studentVo11.add(studentVo2);

		
		return studentVo11;
	}
	public static void main(String[] args) {
		InseartViaArrayObject obj =new InseartViaArrayObject();
		obj.inseart();
		ArrayList<StudentVo> studentV=new ArrayList<StudentVo>();
		studentV=obj.inseart1();
		System.out.println(studentVo1[0].getName());
		System.out.println(studentVo1[0].getCity());
		System.out.println(studentVo1[0].getAge());
		System.out.println(studentVo1[0].getPhoneNumber());
		System.out.println("==================================");
		System.out.println(studentVo1[0].getName());
		System.out.println(studentVo1[0].getCity());
		System.out.println(studentVo1[0].getAge());
		System.out.println(studentVo1[0].getPhoneNumber());
		System.out.println("==================================");
		System.out.println(studentVo1[0].getName());
		System.out.println(studentVo1[0].getCity());
		System.out.println(studentVo1[0].getAge());
		System.out.println(studentVo1[0].getPhoneNumber());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		StudentVo obj1;
		obj1= studentV.get(0);
		System.out.println(obj1.getName());
		System.out.println(obj1.getCity());
		System.out.println(obj1.getAge());
		System.out.println(obj1.getPhoneNumber());
		System.out.println("==================================");
		StudentVo obj11;
		obj11= studentV.get(1);
		System.out.println(obj11.getName());
		System.out.println(obj11.getCity());
		System.out.println(obj11.getAge());
		System.out.println(obj11.getPhoneNumber());
		System.out.println("==================================");
		StudentVo obj12;
		obj12= studentV.get(2);
		System.out.println(obj12.getName());
		System.out.println(obj12.getCity());
		System.out.println(obj12.getAge());
		System.out.println(obj12.getPhoneNumber());
	}

}
