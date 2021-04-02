class NormalOverLoad 
{
	public void add()
	{
		System.out.println("normal add()");
	}
	//public static void add()///this will throw error because we have two method have same name 
	//{
	//	System.out.println("static add()");
	//}
	public void method()
	{
		System.out.println("normal method ");
	}
	public  void method(int a)
	{
		System.out.println(" int a method");
	}
	public static void main(String[] args) 
	{
		
		NormalOverLoad obj=new NormalOverLoad();
		obj.add();
		obj.method();
		obj.method(10);

	}
}
