package com.ord.pojo;

import java.util.Scanner;

public class newUser {

	public void addUser()
	{
		Scanner sobj=new Scanner(System.in);
		CustomerVo obj=new CustomerVo();
		 System.out.println("please enter your details");
			System.out.println("name:");
			obj.setName(sobj.nextLine());
			System.out.println("address:");
			obj.setAddress(sobj.nextLine());;
			System.out.println("PhoneNumber:");
			obj.setPhoneNumber(sobj.nextLine());
			CustomerData.customer.add(obj);
	}
}
