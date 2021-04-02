package com.zafar.plyEnum;

public enum DefferentVallueDeclare {
	zafar();
	DefferentVallueDeclare()
	{
		this(10);
		System.out.println("Default constructor");
	}
	DefferentVallueDeclare(int i) {
		this(10,"zafar");
		System.out.println("Int constructor");

	}
	DefferentVallueDeclare(int a,String Name)
	{
		System.out.println("int and String Constructor");

	}
}
