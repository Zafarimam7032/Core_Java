class Outer 
{
	static class Inner
	{
		String name="zafar imam";
		static int a=40;
		public void name()
		{
			System.out.println("Name:"+name);
		}
		public static void display()
		{
			System.out.println("display method of  innerclass");
		}
		static 
		{
			System.out.println("static block  of  innerclass");
		}
	}
	public static void show()
		{
			System.out.println("show method of  Outerclass");
		}

	public static void main(String[] args) 
	{
		Outer obj=new Outer();
	obj.show();
	Outer.Inner obj1=new Outer.Inner();
	obj1.name();
	Inner.display();
	}
}
