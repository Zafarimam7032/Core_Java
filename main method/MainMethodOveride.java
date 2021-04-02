class MainMethodOveride extends MainMethodOverLoadWithReturn 
{
	public static void main(String [] a)
	{
		int e=MainMethodOveride.main(40,60);
		System.out.println("Result: "+e);
		String d=MainMethodOveride.main("zafar imam");
		System.out.println(" " +d+" ");
	}
	public static int main(int a,int b) 
	{
		int d=a+b;
		return d;
	}
	public static String main(String a)
	{
		return a;
	}
}
