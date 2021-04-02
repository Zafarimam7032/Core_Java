
public class Car extends Bike{
	int a;
	int  b;
	public void display1()
	{
		System.out.println("display1() method of class car");
	}
	public void mul()
	{
		System.out.println("Multiply:"+(a*b));
		super.a=a;
		super.b=b;
	}

}
