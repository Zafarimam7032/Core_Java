
public interface StaticMethodAndStaticVariable {
	final  int a=10;
	final static int b=20;
	int c=30;//default is allowed 
	String name="zafar";
	static String  city="delhi";
	public double salry=325324523;
	//private String e="zafar";//private is not allowed 
	//protected String email="zafarimam23@gmail.com";//protected is not alowed
	String email="zafarimam23@gmail.com";
	default void add() {// we can write body of any method by using default keyword
		System.out.println("add() method of interface");
		
	}
	public static void  mul()
	{
		System.out.println("multiply:"+(a*b));
		System.out.println("multiply:"+(a*c));
		
	}
}
