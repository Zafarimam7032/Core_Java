import java.util.*;
class MainMethodOverload 
{
	public static void main(String[] args) 
	{
		System.out.println("Default Main method");
		main(10,20);
		//main(10.5,10); because 10.5 trated as daube
		main(10.0f,10);
		String [] a={"a","b","c"};
		String [] b={"a","c"};
		//a={"a","b","c"};
		//b={"a","b","c"};
		
		main(a,b);
	}
		public static void main(String[] a,String [] b) 
	{
		System.out.println(" String[] a,String [] b Default Main method");
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));
	}
		public static void main(int a,int b) 
	{
		System.out.println(" int a,int b Default Main method");
	}
		public static void main(float a,int b) 
	{
		System.out.println(" float a,int b Default Main method");
	}
}
