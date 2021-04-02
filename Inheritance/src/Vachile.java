
public class Vachile extends Car
{
	public void change(int a,int b)
	{
		super.a=a;
		super.b=b;
	}
public static void  main(String [] a)
{
	Vachile obj=new Vachile();
	obj.display();
	obj.display1();
	obj.change(100, 20);
	obj.mul();
	obj.add();
}
}
