//import java.util.*;
class MainMethodCallFromAnotherClass 
{
	public static void main(String[] a) 
	{
		System.out.println("MainMethodCallFromAnotherClass main method");
		//args[0]="zafar imam";
		 String q[]={"Zafar","imam"};
		MainMethodCall.main(q);
		
	}
}
