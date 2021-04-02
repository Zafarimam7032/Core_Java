class MainMethodOverLoadWithReturn 
{
	public static void main(String[] args) 
	{
		System.out.println("Defualt main method ");
		int c=MainMethodOverLoadWithReturn.main(23,45);
		System.out.println("Result: "+c);
		String d=MainMethodOverLoadWithReturn.main("Java program");
		System.out.println(" this is "+d);
		float f=MainMethodOverLoadWithReturn.main(107.04F,340.56F);
		System.out.println("Addition: " +f);
	}
	public static int main(int a,int b)
	{
		int c;
		c=a+b;
		return c;
		
	}
	public static  String main(String a)
	{
		return a;
	}
	public static float main(float a,float b)
	{
		return (a+b);
	}


}
