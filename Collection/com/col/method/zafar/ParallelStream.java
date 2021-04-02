package com.col.method.zafar;

import java.util.Vector;

public class ParallelStream {
	public static void main(String[] args) {
		Vector<Integer> vobj=new Vector<Integer>();
		vobj.add(132);
		vobj.add(1332);
		vobj.add(132332);
		vobj.add(1232);
		vobj.add(13232);
		vobj.add(13342);
		vobj.add(1326);
		vobj.add(232132);
		vobj.add(23132);
		vobj.add(41132);
		vobj.parallelStream().forEach(i -> System.out.println(i));// parallelStream methos basically create thread for execute fastly 
	}

}
