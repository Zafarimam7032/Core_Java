package com.col.method.zafar;

import java.util.ArrayList;

public class ToArray {
	public  void display()
	{
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add("zafar");
		obj.add('z');
		obj.add(232.09);
		Object obj1[]=obj.toArray();
		for(Object obj2:obj1)
		{
			System.out.print(" "+ obj2);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		ToArray obj3=new ToArray();
		obj3.display();
		ArrayList<Integer> arobj=new ArrayList<Integer>();
		arobj.add(1);
		arobj.add(232);
		arobj.add(5453);
		arobj.add(3552);
		arobj.add(352122);
		arobj.add(355235);
		arobj.add(355225);
		arobj.add(352412);
		System.out.println(arobj);
		Object [] arin=arobj.toArray();// toArray Method convert collection to array
		for(Object i:arin)
		{
			System.out.print("  " +i);
		}
		
		
	}

}
