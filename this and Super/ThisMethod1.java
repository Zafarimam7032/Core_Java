class ThisMethod1 extends ThisMethod2
{
	public void display()
	{
		System.out.println("display() of ThisMethod1  ");
		add();
	}
	public void add()
	{
		int a=20;
		int b=30;
		System.out.println("Add() of ThisMethod1 "+(a+b));
		super.display();
	}
}
