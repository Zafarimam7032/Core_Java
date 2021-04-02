 package com.zafar.lemda;

public class NormalLemda {
	public static void main(String [] args)
	{
		NormalInterface obj= new NormalInterface() {// interface object
			
			@Override
			public void display() {
				System.out.println("display method");
				//test1();
				
			}
			
			@Override
			public void add() {
				
				System.out.println("add method");

			}
		};
		
		System.out.println("obj instanceof  NormalInterface"+ (obj instanceof  NormalInterface));
				
		obj.display();
		obj.add();
		//obj.test1();
		LemdaInterface obj1=() ->// lemda Expression 
		{
			System.out.println("show method");

		};
		obj1.show();
		LemdaInterface obj2=() ->// lemda Expression 
		{
			System.out.println("show method");

		};
		obj1.show();
		NormalLemda obj123=new   NormalLemda();
		obj123.obj12();
		 show();
	}

	private static LemdaInterface show() {
		System.out.println("show method  with intrface return type ");
		return null;
	}

	//static LemdaInterface obj12=(LemdaInterface) new NormalLemda();
	private void obj12() {
			System.out.println("interface object");
	}
	
	

}
