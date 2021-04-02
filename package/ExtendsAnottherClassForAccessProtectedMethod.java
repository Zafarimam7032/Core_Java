package  com.Mprct.p2;
import com.Mprct.p1.NormalClass;


public class  ExtendsAnottherClassForAccessProtectedMethod extends NormalClass
{
	
	public static void main(String[] args) 
	{
		System.out.println(" main methosd of ExtendsAnottherClassForAccessProtectedMethod");
		ExtendsAnottherClassForAccessProtectedMethod obj=new ExtendsAnottherClassForAccessProtectedMethod();
		NormalClass obj1=new NormalClass();
		obj.display();//public method can be display directly here 
		// show is protected method   
		obj.show();// this is protected method we can access only by extending  that subclass this ijs pnly way to aceesss
		//obj.check();// this is default method it can not access outside the package 



	}
}
