package com.grw.list.method.zafar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class replaceAllMethod {
	public static void main(String[] args) {
		List<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(300);
		obj.add(400);
		obj.add(600);
		obj.add(700);
		obj.add(900);
		obj.add(1000);
		obj.add(1100);
		obj.add(1300);
		for(int i:obj)
		{
			System.out.print(" "+i);
		}
		Collections.replaceAll(obj,300,30000);
	}

}
