class NormalClass 
{
	int a;
	int b;
	public void takeObject(NormalClass obj)
	{
		System.out.println("objected accepted ");
		add(100,20);
		addDisplay();
		multi();
		div();
		sub();
		
	}
	
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void addDisplay()
	{
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	public  void multi()
	{
		
		System.out.println("multi:"+(a*b));
	}
	public  void sub()
	{
		
		System.out.println("sub:"+(a-b));
	}
	public  void div()
	{
		
		System.out.println("multi:"+(a/b));
	}

}
