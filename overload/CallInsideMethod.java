class CallInsideMethod 
{
	public void display()
	{
		System.out.println("dislay()");
		this.display(10,20);//bydefault jvm add this keyword bro
		display(10,20);
	}
	public void display(int a,int b)
	{
		System.out.println("int a,int b dislay() "+a+" and "+b);
		display(10,'c');//here also bydefault its add this keyword 
		
	}
	public void display(int d,char s)
	{
		System.out.println("int d,char s dislay() "+d+" and "+s);
		add();
	}
	public static void add()
	{
		System.out.println("static method add()");
		//magic();// we can not call non static method from static method it leads compile time error;
	}
	public void magic()
	{
		System.out.println("magic instance method");
	}

	public static void main(String[] args) 
	{
		CallInsideMethod obj=new CallInsideMethod ();
		//System.out.println("");
		obj.display();
	}
}
