class NormalThis 
{

	int a;
	int b;
	public void add(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public void display()
	{
		int c=a+b;
		System.out.println("Addition:"+c);
	}
	public  void multi()
	{
		
		System.out.println("multi:"+a*b);
	}
	public  void sub()
	{
		
		System.out.println("sub:"+a-b);
	}
	public  void div()
	{
		
		System.out.println("multi:"+a/b);
	}

	public static void main(String[] args) 
	{
		NormalThis obj=new NormalThis();
		obj.add(10,20);
		obj.display();
		obj.multi();
		obj.sub
		//System.out.println();
	}
}
