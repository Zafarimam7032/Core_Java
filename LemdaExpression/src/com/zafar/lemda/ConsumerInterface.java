package com.zafar.lemda;

import java.util.function.Consumer;

public class ConsumerInterface {
	public static void main(String [] arga) {
	Consumer<Integer> obj=new Consumer<>() {
		public void accept(Integer i) {
			System.out.println("number"+i);
			
		}

	};
	obj.accept(10);
			
	Consumer<Integer> obj1=(i) ->// lemda Expression
	{
		System.out.println("number"+i);

	};
	obj1.accept(200);
	}
}
