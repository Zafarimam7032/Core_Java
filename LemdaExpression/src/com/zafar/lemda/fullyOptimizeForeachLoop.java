package com.zafar.lemda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class fullyOptimizeForeachLoop {
	public static void main(String[] args) {
		List<Integer> obj= new ArrayList<Integer>();
		obj.add(0, 1);
		obj.add(1, 2);
		obj.add(2, 3);
		obj.add(3, 4);
		Consumer<Integer> obj1=(i) ->{
				System.out.println(i);
				
			
			
		};
		obj.forEach(obj1);
		System.out.println("================================================");
		Consumer<Integer> obj2=(i) ->System.out.println(i);
			
		
		

	obj.forEach(obj2);
	System.out.println("=======================================================");
	// replace with source code 
	obj.forEach((i) ->System.out.println(i));
		
	}

}
