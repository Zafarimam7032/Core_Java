package com.zafar.plyEnum;

public enum UsedAndAccessSpecifierInConstructor {
    call(100);
	private  final int a;
	
	 UsedAndAccessSpecifierInConstructor(int a)
	{
		this.a=a;
	}
	public int getA()
	{
		return a;
	}


}
