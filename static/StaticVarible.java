class StaticVarible 
{
	static int a=20;
	public void display()
	{
		System.out.println("A"+a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		StaticVarible s=new StaticVarible();
		s.display();
	}
}
