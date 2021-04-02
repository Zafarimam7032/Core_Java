package com.stic.p1;

public class StaticMember {
	static int a=20;
	static String name="Zafar Imam";
	static float b=23.45f;
	public static void display()
	{
		System.out.println("==============this is public  display method============");
		System.out.println("Number:"+a);
		System.out.println("Name:"+name);
		System.out.println("Number:"+b);
	}
	protected static void show()
	{
		System.out.println("=============this is protected show method==============");
		System.out.println("Number:"+a);
		System.out.println("Name:"+name);
		System.out.println("Number:"+b);
	}
	static void check()
	{
		System.out.println("=============this is default check method=============");
		System.out.println("Number:"+a);
		System.out.println("Name:"+name);
		System.out.println("Number:"+b);
	}
	public static void main(String[] args) {
		display();
		show();
		check();
	}
	

}
