package com.itr.metd.zafar;

import java.util.ArrayList;
import java.util.Iterator;

public class NextMethod {
	public static void main(String[] args) {
		ArrayList<Integer> arobj=new ArrayList<Integer>();
		arobj.add(1);
		arobj.add(2);
		arobj.add(3);
		arobj.add(4);
		arobj.add(5);
		arobj.add(6);
		arobj.add(7);
		arobj.add(8);
		arobj.add(9);
		arobj.add(10);
		arobj.add(11);
		Iterator<Integer> itrobj=arobj.iterator();
		while(itrobj.hasNext())// hasnext is boolean type is it check how many data is there if not there it throw false  then loop will turminate
			System.out.println(itrobj.next());// next method return value  that is there in collection list;
	}

}
