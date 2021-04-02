package com.col.method.zafar;

import java.util.ArrayList;

public class Stream {
	public static void main(String[] args) {
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		obj1.add(1);
		obj1.add(12);
		obj1.add(30);
		obj1.add(550);
		obj1.add(400);
		obj1.add(14555);
		obj1.add(143);
		obj1.add(134);
		obj1.add(1344);
		obj1.add(134);
		obj1.add(431);
		obj1.stream().filter(i -> (i%3==0)).forEach(i ->System.out.println(i));
	}

}
