class SingletonExample1
{
	SingletonExample1()
	{
		System.out.println("SingletonExample1 constructor");
	}
	SingletonExample1(int a)
	{
		System.out.println("SingletonExample1 constructor"+a);
	}
}
class SingletonExample extends  SingletonExample1
{
	private static  SingletonExample obj=null;

	String name; 
	private SingletonExample()
	{
		this(10);
		name="zafar imam";
		System.out.println("my name is "+name);

	}
	private SingletonExample(int a)
	{
		super(10);
		System.out.println("SingletonExampleCall "+a);
	}
	public static SingletonExample object() 
	{
		if(obj==null)
		{
			return obj=new SingletonExample();
		}
		else{

			return obj;
		}

	
	}
	public void display()
	{
		System.out.println("hello how are you bro what are you doing ");
	}
}
class SingletonExampleCall
{
	public static void main(String [] args)
	{
	SingletonExample obj1=SingletonExample.object();
	obj1.name=(obj1.name).toUpperCase();
	System.out.println("name"+obj1.name);
	obj1.display();

	}

}
