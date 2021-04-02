package com.zafar.lemda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
 class Abcdef implements Consumer<Integer>
 {

	@Override
	public void accept(Integer i) {
		System.out.println(i);
	}
	 
 }
public class ForEachLoop { 
	public static void main(String[] args) {
	Consumer<Integer> obj1=new Abcdef();
	
		List<Integer> obj= new ArrayList<Integer>();
		obj.add(0, 1);
		obj.add(1, 2);
		obj.add(2, 3);
		obj.add(3, 4);
//		for (int i = 0; i < obj.size(); i++) {
//			System.err.println(obj.get(i));
//			
//		}
		//obj.forEach(i ->System.out.println((i)));
		obj.forEach(obj1);
	}

}
