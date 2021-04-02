class SuperClass extends A
{
	private SuperClass()
	{
		System.out.println(" default SuperClass");
	}
	SuperClass(int a)
	{
		System.out.println("int a SuperClass");
	}
	SuperClass(String a,int b)
	{
		System.out.println("String a and int b SuperClass");
	}
	public void display()
	{
		System.out.println("display() method SuperClass");
	}
	public void show()
	{
		System.out.println("show() nmethod SuperClass");
	}

}
public class ThisClass extends SuperClass
{
	ThisClass()
	{
		
		this(20);
		System.out.println(" default ThisClass()");
	}
	ThisClass(int a)
	{
		
		System.out.println("int a ThisClass()");
		this.show();
	}
	ThisClass(String a,int b)
	{
		System.out.println("String b int b ThisClass()");
	}
	public void display()
	{
		System.out.println("display() method of ThisClass");
	}
	public void show()
	{
		System.out.println("show() method of  Thisclass");
	}
	public static void main(String[] args) 
	{
		ThisClass  obj=new ThisClass();
		
	}
} 
