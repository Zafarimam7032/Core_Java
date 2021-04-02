package com.var.cl;

public class InstanceVaribleAc extends InstanceVariable {
	public void show()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Number:"+number);
		//System.out.println("Charector:"+ch);// can not accesss outside the class becaise it is private access
	}
	public static void main(String[] args) {
		InstanceVaribleAc obj=new InstanceVaribleAc();
		obj.show();
		System.out.println("======================================");
		obj.display();
		//obj.ch='a';// we can not modifie also ;
		InstanceVariable obj1=new InstanceVariable();
		//obj1.ch='3';// even same class object we can not modifie value;
		System.out.println("======================================");
		obj1.display();
		InstanceVariable obj2=new InstanceVaribleAc();
		//obj2.ch='z'; // by taking parent reference we can not modifier also;
		System.out.println("======================================");
		obj2.display();
		
	}
}
