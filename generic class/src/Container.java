//import java.util.ArrayList;
//import java.util.List;
//import java.awt.Container;

public class Container<T> 
{
	T a;
	public static void main(String [] s)
	{
		System.out.println("main method");
		Container<Integer> sa= new Container<>();
		int b=sa.a=30;
		System.out.println(b);
	}
		

}
