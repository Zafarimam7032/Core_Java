class StaticMethodVariable{
	static int a=200;
	static int b=40;
	static int c;
	public static void add(){
		c=a+b;
		System.out.println("Addition:"+c);
	}

	public static void sub(){
		c=a-b;
		System.out.println("Subtraction:"+c);
	}

	public static void mul(){
		c=a*b;
		System.out.println("Multiple:"+c);
	}

	public static void div(){
		c=a/b;
		System.out.println("Divion:"+c);
	}
	public static void main(String [] args)
	{
		add();
		sub();
		mul();
		div();
	}
}

        