package  com.Mprct.p1;
public class NormalClass 
{
	public  void display() 
	{
		System.out.println("NormalClass display() ");
	}
	protected void show()
	{
		System.out.println("NormalClass show()");
	}
	 void check()
	{
		 System.out.println("NormalClass  chech()");
	}
	private void method()
	{
		System.out.println("NormalClass method() ");
	}
	public static void main(String [] args)
	{
		System.out.println("main method for NormalClass");
		NormalClass obj=new NormalClass();
		obj.display();
		//ExtendsAnottherClassForAccessProtectedMethod.takeObject(obj);
	}
}
