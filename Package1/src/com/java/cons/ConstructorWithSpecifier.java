package com.java.cons;

public class ConstructorWithSpecifier {
	public ConstructorWithSpecifier()
	{
		System.out.println("public ConstructorWithSpecifier()");
	}
	protected ConstructorWithSpecifier(int a)
	{
		System.out.println("protected ConstructorWithSpecifier()"+a);
	}
	ConstructorWithSpecifier(String a)
	{
		System.out.println(" defult ConstructorWithSpecifier()"+a);
	}
	private ConstructorWithSpecifier(int a,int b)
	{
		System.out.println(" privatte ConstructorWithSpecifier()"+(a+b));
	}
	protected void name() {
		System.out.println("Name ()");
		
	}
	public static void main(String[] args) {
		System.out.println("====== this is public constructor=======");

		new ConstructorWithSpecifier();// this is public constructor
		
		System.out.println("====== this is protected constructor====");
		new ConstructorWithSpecifier(10);// this is protected constructor
		
		System.out.println("======this is default constructor=======");
		new ConstructorWithSpecifier("zafar");// this is default constructor
		
		System.out.println("=====this is private constructor========");
		new ConstructorWithSpecifier(10,20);// this is private constructor

	}
	

}
