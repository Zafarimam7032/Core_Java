class NonStaticVariableWithSataticMethod 
{
	// int		 a=30;
	// int		 b=50;
	// String  	c="zafar imam";
	// float	    e=309.08f;
	// char		f='A';
	// boolean	g=false;
	// double	    h=6993403.0696;
	// long		i=24335353;
	// byte		j=34;
	// short      k=43;
	public static void display() /* static varibale can not use in static varibale its leads compile error*/
	{
		//System.out.println("=======non Static varibale========");
		//System.out.println("	int "+a);
		//System.out.println("	int "+b);
		//System.out.println("	String: "+c);
		//System.out.println("	float: "+e);
		//System.out.println("	char: "+f);
		//System.out.println("	boolean: "+g);
		//System.out.println("	long: "+h);
		//System.out.println("	byte: "+j);
		//System.out.println("	short: "+k);
	}
	public static void main(String[] args) 
	{
		System.out.println("main Method");
		NonStaticVariableWithSataticMethod e=new NonStaticVariableWithSataticMethod();
		display();
	}
}
