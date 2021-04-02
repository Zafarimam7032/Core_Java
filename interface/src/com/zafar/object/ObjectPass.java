package com.zafar.object;

public interface ObjectPass {
	
	public static void  objectTake(ObjectPass obj)
	{
		check();
		if(obj!=null) {
			System.out.println("object have taken sucussfully");
	
		}
		else {
			System.out.println("check it  while calling");

		}
		
	}
	public static void create()
	{
		System.out.println("create() static method of interface class");
	}
	private  static void check()// only public and private is allowed
	{
		System.out.println("check method of ObjetPass");

	}
	default   void method()// we not write default static method
	{
		System.out.println("check method of ObjetPass");

	}
	
	default void add()// only default  instance method is allowed 
	{
		System.out.println("add()  method of ObjetPass");
	}
	default void show()
	{
		System.out.println("show()  method of ObjetPass");

	}

}
