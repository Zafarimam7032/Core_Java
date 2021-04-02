class  StaticVariableInsideTheMethod
{
	// cannot create static variable inside the non static method
	/*void addition(){
		static int a=20;
		static int b=20;
		static int c=a+b;
		System.out.println("Result:"+c);
	}*/
	//can not declare static variable inside  the static method also
	/*static void addition(){
		static int a=20;
		static int b=20;
		static int c=a+b;
		System.out.println("Result:"+c);
	}*/
	static int a=20;
	static int b=20;
	//we can not create also final variable in static in static method
	/*static void addition(){
		static int c=a+b;
		System.out.println("Result:"+c);
	}*/
	static void addition(){
		int c=a+b;
		System.out.println("Result:"+c);
	}
	

	public static void main(String[] args) 
	{
		// StaticVariableInsideTheMethod n =new  StaticVariableInsideTheMethod1();
		 //n.addition();
		 //addition();
		 addition();
	}
}
