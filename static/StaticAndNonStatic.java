class StaticAndNonStatic 
{
	String a="Greatwits";
	static String b="company";
	public static void display()
	{
		 int c=30;
		 //int static,e=220;
		System.out.println(c);
		//System.out.println(a);
		System.out.println(b);
	}
	public void displayNon()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		display();
	}
}
