import java.awt.Container;
import java.util.*;
public class NormalGeneric<T> 
{
	 T a;
	 T name;
	void Normal()
	 {
		 //System.out.println(a);
		 System.out.println(name);
	 }
	public static void main(String [] s)
	{
		System.out.println("main method");
		//Container<T> sa= new Container<>();
		 NormalGeneric<String> obj=new  NormalGeneric<>();
		List<Integer> sb=new ArrayList<>();
		//obj.Normal();
		//obj.a=40;
		obj.name="Zafar";
		obj.Normal();
		System.out.println(obj.a);
	}

}
