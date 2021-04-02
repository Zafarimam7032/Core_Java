class StaticAndNonstaticCall 
{
	public void instance()
	{
		System.out.println(" normal instance()");
	}
	public void instance(int a)
	{
		System.out.println("int a instance()"+a);
	}
	public static void instance(int a,String b)
	{
		System.out.println("int a String b instance()"+a+" "+b);

	}
	public static  void instance(int a,int b)
	{
		System.out.println("int a int b instance()"+a+" "+b);
	}
	public void instance(float a ,int b)
	{
		System.out.println("flaot a int b instance()"+a+" "+b);
	}
	public static void display()
	{

	}
	public static void main(String[] args) 
	{
		StaticAndNonstaticCall obj=new StaticAndNonstaticCall ();
		
		obj.instance();
		obj.instance(10);
		obj.instance(10,"Zafar");//eve we can call static member by using obj name 
		obj.instance(10,20);//    we can modify value also
		obj.instance(10.0f,20);
		obj.display();
		display();

	}
}
