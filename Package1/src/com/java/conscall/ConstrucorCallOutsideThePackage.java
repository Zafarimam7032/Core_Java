package com.java.conscall;
import com.java.cons.*;

public class ConstrucorCallOutsideThePackage extends ConstructorWithSpecifier{
	public static void main(String[] args) {
		System.out.println("====== this is public constructor=======");// for  constructor only public vissible
		new ConstructorWithSpecifier();// this is public constructor
		ConstrucorCallOutsideThePackage obj=new ConstrucorCallOutsideThePackage();
		obj.name();// protected method is allowed but protected/default/ private  constructor  not allowed
		
//		
//		System.out.println("====== this is protected constructor====");
//		new ConstructorWithSpecifier(10);// this is protected constructor
//		
//		System.out.println("======this is default constructor=======");
//		new ConstructorWithSpecifier("zafar");// this is default constructor
//		
//		System.out.println("=====this is private constructor========");
//		new ConstructorWithSpecifier(10,20);// this is private constructor
	}

}
