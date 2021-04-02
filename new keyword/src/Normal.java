
public class Normal {
	public void takeObject(Normal obj)
	{
		obj.add();
		obj.sub();
		obj.div();
		obj.multi();
		
	}
	public void add()
	{
		int a=20;
		int b=40;
		System.out.println("Addition:"+(a+b));
	}
	public void multi() 
	{

		int a=20;
		int b=40;
		System.out.println("Multipication:"+(a*b));
	}
	public void sub()
	{

		int a=20;
		int b=40;
		System.out.println("Subtraction:"+(a-b));
	}
	public void div()
	{

		int a=20;
		int b=40;
		System.out.println("Division:"+(a/b));	
	}

}