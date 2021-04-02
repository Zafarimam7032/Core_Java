class SimpleStatic  
{ 
	static int a=10;
	static int b=20;
	void add()
	{
		int c=a+b;
	
		System.out.println("Result:"+c);
	}

	public static void main(String[] args) 
	{
		SimpleStatic s= new SimpleStatic();
		s.add();
	}
}
