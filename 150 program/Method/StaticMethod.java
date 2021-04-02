class StaticMethod
{
	public static void add()
	{
	int a=20;
	int b=30;
	int c=a+b;
	System.out.println("Result:"+c);
	}


	public static void main( String []a )
	{
		System.out.println("main method");
		add();
	}
}
