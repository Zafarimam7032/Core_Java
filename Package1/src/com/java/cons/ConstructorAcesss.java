package com.java.cons;

public class ConstructorAcesss extends ConstructorWithSpecifier {

	public static void main(String[] args) {
		System.out.println("====== this is public constructor=======");

		new ConstructorWithSpecifier();// this is public constructor
		
		System.out.println("====== this is protected constructor====");
		new ConstructorWithSpecifier(10);// this is protected constructor
		
		System.out.println("======this is default constructor=======");
		new ConstructorWithSpecifier("zafar");// this is default constructor
		
//		System.out.println("=====this is private constructor========");
//		new ConstructorWithSpecifier(10,20);// this is private constructor// this is private can not call outside the classs
		System.out.println("====== this is public constructor=======");

		new ConstructorAcesss();// this is public constructor// only we can call no argument constructor from this class reference 
		
									// constructor can be default public , protected 
		
	//	System.out.println("====== this is protected constructor====");
		//new ConstructorAcesss(10);// this is protected constructor
		
		//System.out.println("======this is default constructor=======");
		//new ConstructorAcesss("zafar");// this is default constructor

	}
}
