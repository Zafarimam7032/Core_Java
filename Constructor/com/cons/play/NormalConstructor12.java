package com.cons.play;
class cons {
	 private cons()
	{
		System.out.println("default1 constructor:");

	}
	  cons(int o)
		{
			System.out.println("default1 constructor:");

		}
		
		
	
}

public class NormalConstructor12 extends cons {
	NormalConstructor12()
	{
		super(10);
		new NormalConstructor12(29);
		System.out.println("default constructor:");
	}
	
	NormalConstructor12(int a){
		super(20);
		System.out.println("int constructor:");

	}
 public static void main(String[] args) {
	 NormalConstructor12 obj=new NormalConstructor12();	
}
}
