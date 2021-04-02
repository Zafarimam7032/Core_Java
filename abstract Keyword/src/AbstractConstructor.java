
public abstract class AbstractConstructor {
	AbstractConstructor()// we can create constructor in interface
	{ 
		this(20);
		System.out.println("abstract construct ");
	}
	AbstractConstructor(int a )
	{
		this("Zafar imam");
		System.out.println("abstract construct integer:"+a);
	}
	
	AbstractConstructor(String Name)
	{
		System.out.println("abstract construct Name :"+Name);
	}
	
}
