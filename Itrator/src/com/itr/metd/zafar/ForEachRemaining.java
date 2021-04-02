package com.itr.metd.zafar;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachRemaining {
	public static void main(String[] args) {
		ArrayList<Integer> robj=new ArrayList<Integer>();
		robj.add(1);
		robj.add(2);
		robj.add(3);
		robj.add(4);
		robj.add(5);
		robj.add(6);
		robj.add(7);
		robj.add(8);
		Iterator<Integer> itobj=robj.iterator();
		
		 itobj.forEachRemaining((in) -> System.out.print(" "+in));
		 System.out.println();
		 robj.forEach(i -> System.out.print(" "+i));
	}

}
