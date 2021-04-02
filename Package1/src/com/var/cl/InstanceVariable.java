package com.var.cl;

public class InstanceVariable {
	public String name="Zafar";
	protected int age=23;
			float number=2341.4f;
	private char ch='z'; 
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Number:"+number);
		System.out.println("Charector:"+ch);
	}
	public static void main(String[] args) {
		InstanceVariable obj=new InstanceVariable();
		obj.display();
	}

}
