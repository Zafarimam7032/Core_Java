class  ThisMethod extends ThisMethod1
{
	public void displayThis()
	{
		System.out.println("display() of ThisMethod  ");
		add();
		this.display();
		super.display();
	}
	public void add()
	{
		int a=20;
		int b=30;
		System.out.println("Add() of ThisMethod "+(a+b));
	}
	
	public static void main(String[] args) 
	{
		ThisMethod  obj=new ThisMethod();
		obj.displayThis();
		ThisMethod1  obj1=new ThisMethod1();
		obj1.display();

		
	}
}
