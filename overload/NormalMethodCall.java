class NormalMethodCall  
{
	public void display()
	{
		 System.out.println("non static method display");
	}
	public static void display1()
	{
		 System.out.println("static method display1");

	}
	//public int  display()-------> even thaugh return type is defferent this is no matter of compiler it will throw error;
	//{
	//	 System.out.println("non static method display");
	//	 return 0;
	//}

	public static void main(String[] args) 
	{
		System.out.println("msin method ");
		NormalMethodCall obj=new NormalMethodCall();
		obj.display();
		display1();
		//obj.display();
	}
}
