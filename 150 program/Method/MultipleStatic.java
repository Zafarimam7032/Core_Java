class MultipleStatic
{
	public static void add()
	{
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println("Result:"+c);
	}
	public static void sub()
	{
	
		int a=10;
		int b=30;
		int c=a-b;
		System.out.println("Result:"+c);
	}
	public static void div()
	{
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println("Result:"+c);
	}
	public static void main(String [] a)
	{
	
		System.out.println("main method");
		add();
		sub();
		div();
	}
}
