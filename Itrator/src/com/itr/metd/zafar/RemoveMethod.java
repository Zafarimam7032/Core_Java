package com.itr.metd.zafar;

import java.util.Iterator;
import java.util.Vector;

public class RemoveMethod {
	public static void main(String[] args) {
		Vector<Integer> vobj=new  Vector<Integer>();
		vobj.add(1);
		vobj.add(2);
		vobj.add(3);
		vobj.add(4);
		vobj.add(5);
		vobj.add(6);
		vobj.add(7);
		vobj.add(8);
		vobj.add(9);
		Iterator<Integer> itobj=vobj.iterator();
//		while(itobj.hasNext())
//		{
//			System.out.print(" "+itobj.next());
//		}
		//remove operation 
		while(itobj.hasNext())
		{ 
			Integer i=(Integer)itobj.next();
// removing odd element in list
			if(i%2==1)
			{
				
				itobj.remove();
				
			}
			else
			{
				System.out.print(" "+i);

			}
			
		}
		
	}

}
