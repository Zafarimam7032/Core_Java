class  Constructor12
{
	private Constructor12 ()
	{
		System.out.println("Hello World!");
	}
	Constructor12 (int a,int b)
	{
		System.out.println("int a and int b");
	}
	Constructor12 (int a)
	{
		System.out.println("int a");
	}
	Constructor12 (int a,String b)
	{
		System.out.println("Hello World!");
	}
}
class Constructor123 extends Constructor12
{
	 Constructor123()
	{
		 super(10,"zafar");
	}

}
class Constructor1 extends Constructor123
{


	public static void main(String[] args) 
	{
		Constructor123 a= new Constructor123 ();
	}
}
