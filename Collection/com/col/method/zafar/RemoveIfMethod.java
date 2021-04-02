package com.col.method.zafar;

import java.util.ArrayList;

public class RemoveIfMethod {
 public static void main(String[] args) {
	ArrayList<Integer>  robj=new ArrayList<Integer>();
	robj.add(15);
	robj.add(33);
	robj.add(22);
	robj.add(41);
	robj.add(30);
	robj.add(20);
	robj.add(11);
	System.out.println(robj);
	//robj.forEach(i ->System.out.println(i));
	robj.removeIf(rm -> (rm%2==0));// RemoveIf used for remove element in collection if condition is true
	System.out.println(robj);
}
}
