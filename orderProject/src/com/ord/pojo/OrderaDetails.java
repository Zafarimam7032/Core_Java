package com.ord.pojo;

import java.util.Scanner;

public class OrderaDetails extends CustomerData {
	static OrderaDetails Order;
	
private	String userName;
private	String userAddress;
private	String userPhone;
	public void order() {
		Scanner sobj=new Scanner(System.in);
		
		
		System.out.print(" mobile_number:");
		String Number=sobj.nextLine();
		
		CustomerData customerdata=new CustomerData();
		customer=customerdata.dataInsert();
		CustomerVo obj[]=new CustomerVo[10];
			for(int i=0;i<10;i++)
			{
				
		     obj[i]=customer.get(i);
//		    System.out.println( obj[i].getName());
		    
		    	 if(obj[i].getPhoneNumber().equals(Number))
			     {
		    		 userName=obj[i].getName();
		    		 userPhone=obj[i].getPhoneNumber();
		    		 userAddress=obj[i].getAddress();
			    	 System.out.println("welcome "+obj[i].getName()+ " again sir/madam");
			    	break;
			     }
		    	 else {
		    		 System.out.println("you are not my user list most welcomw you are my new custmer you got 10% discount");
		    		CustomerVo obj11=new CustomerVo();
		    		System.out.println("Name:");
		    		obj11.setName(sobj.nextLine());
		    		System.out.println("Address:");
		    		obj11.setAddress(sobj.nextLine());
		    		System.out.println("Phone Number:");
		    		obj11.setPhoneNumber(sobj.nextLine());
		    		userName=obj11.getName();
		    		userPhone=obj11.getAddress();
		    		userPhone=obj11.getPhoneNumber();
		    		 
		    		
		    		break;
		    	 }
		   
		    
			}
			
			
				
				
			ItemMenu obj1=new ItemMenu();
			System.out.println("welcome sir this is our menu");
			System.out.println("if you want veg item press '1'  and for non veg please press '2'");
			int choose=sobj.nextInt();
			sobj.nextLine();
			Recieved objRecieved=new Recieved();
			if(choose==1)
			{
				obj1.vegItem();
				objRecieved.vegrecipt();
				
			}
			else
			{
				obj1.nonVegItem();
				objRecieved.nonvegrecipt();
			}
		
		
		
		
	}
	
	private void fianlreceived()
	{
		System.out.println("you have successfully orderplaced");
		System.out.println("Name:"+userName);
		System.out.println("mobile Number:"+userPhone);
		System.out.println("addresss:"+userAddress);
		System.out.println("total bill: "+Recieved.total);
		
	}
	public static void main(String[] args) {
		Order=new  OrderaDetails();
		Order.order();
		Order.fianlreceived();
		
		
	}
	

}
