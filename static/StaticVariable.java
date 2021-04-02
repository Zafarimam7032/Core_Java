class StaticVariable 
{
	static int		 a=30;
	static int		 b=50;
	static String	c="zafar imam";
	static float	e=309.08f;
	static char		f='A';
	static boolean	g=false;
	static double	h=6993403.0696;
	static long		i=24335353;
	static byte		j=34;
	static short    k=43;
	public void display()
	{
		System.out.println("==============varibale=============");
		System.out.println("	int "+a);
		System.out.println("	int "+b);
		System.out.println("	String: "+c);
		System.out.println("	float: "+e);
		System.out.println("	char: "+f);
		System.out.println("	boolean: "+g);
		System.out.println("	long: "+h);
		System.out.println("	byte: "+j);
		System.out.println("	short: "+k);
		
		//System.out.println();
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		StaticVariable d=new StaticVariable();
		d.display();
	}
}
