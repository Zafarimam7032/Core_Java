class StaticMethod  
{
	static void multiply(){
		int a=20;
		int b=5;
		System.out.println("Result:"+(a*b));
	}
	static int multi(){
		int a=30;
		int b=6;
		int c=a*b;
		return c;
	}
	static boolean check(){
		int age=20;
		boolean d;
			if (age >18)
			{
			return true;
			}
	return true;
	}
	static float count()
	{
		float a=20.4f;
		float b=30.5f;
		
		return (a+b);
	}
	static double sub(){
		double a=30.6;
		double b=40.56;
		double c=a-b;
		return c;
	}
	static char add(){
		char ch='a';
	         ch='s';
		return ch;
	}
	static String str(){

		return "zafar";
     }
	 static String str1(){
         String ch="hello Zafar imam you are good  programming ";

		return ch;
     }
	 static short sh()
	{
		short a=20;
	 	short b=30;
		//return a+b; if you are using two or more varible in java then you should pranthises
		return (short)(a+b);// we should use type convertion in java int to short because it using by default integerso we will convert .
    }
	static  short ch1()
	{
		short a=12000;
		short b=3400;
		short c=(short)(a+b);
		return c;
	}
	static byte br1(){
		byte a=20;
		byte b=20;
		byte c=a+b;
		return  hb

	public static void main(String[] args) 
	{
		multiply();
		multi();
		
		System.out.println("Result:"+multi());
		System.out.println("Result:"+check());
		System.out.println("Result:"+count());
		System.out.println("Result:"+sub());
		System.out.println("Result:"+add());
		System.out.println("Result:"+str());
		System.out.println("Result:"+str1());
		System.out.println("Result:"+sh());
		System.out.println("Result:"+ch1());



	}
}
