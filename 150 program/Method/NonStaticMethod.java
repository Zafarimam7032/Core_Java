class NonStaticMethod
{

	public  void add()
	{
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println("Result:"+c);
		
	}
	public  void sub()
	{
	
		int a=10;
		int b=30;
		int c=a-b;
		System.out.println("Result:"+c);
		
	}
	public  void div()
	{
		int a=10;
		int b=3;
		int c=a/b;
		System.out.println("Result:"+c);
	}
	public static void main(String [] a)
	{
	
		System.out.println("main method");
		NonStaticMethod c= new NonStaticMethod();
		c.add();
                c.div();
		c.sub();
		
		
	}
}