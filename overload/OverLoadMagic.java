class OverLoadMagic 
{
	static OverLoadMagic obj=new OverLoadMagic ();

	public static void display()
	{
		System.out.println(" static display()");
		obj.display(10);
	}
	public void display(int a)
	{
		System.out.println("instance display()"+a);
	}
	public static void main(String[] args) 
	{
		//OverLoadMagic obj1=new OverLoadMagic ();
		display();
		
	}
}
