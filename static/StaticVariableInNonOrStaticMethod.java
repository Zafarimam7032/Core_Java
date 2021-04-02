class StaticVariableInNonOrStaticMethod 
{
	public void display()
	{
		//static int a=40;
		//static int b=40;		/*static variable is not allowed inside the  non static method */
		//System.out.println(a);
		//System.out.println(b);
		System.out.println("non static method");
	}
	public static void display1()
	{
		//static int a=40;
		//static int b=40;
		//System.out.println(a);/*static variable is not allowed inside the   static method */
		//System.out.println(b);
		System.out.println(" static method");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		StaticVariableInNonOrStaticMethod s=new StaticVariableInNonOrStaticMethod();
		s.display();
		  display1();

	}
}
