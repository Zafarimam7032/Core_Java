public class InnerOutter
{	
	 class Inner
	{
		public void display()
		{
			System.out.println("inner class method");
		}
	}
	static class StaticInner
	{
		public void display1()
		{
			System.out.println("inner class method");
		}
				
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		InnerOutter o=new InnerOutter();
		InnerOutter.Inner obj=o.new Inner();
		obj.display();
		InnerOutter.StaticInner obj1=new InnerOutter.StaticInner(); 
		obj1.display1();
	}
}
