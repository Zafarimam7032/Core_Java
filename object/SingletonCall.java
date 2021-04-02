class Singleton 
{
	static  Singleton obj;
	private  Singleton()
	{
		System.out.println("private constructor");
	}
	public static Singleton createObject()
	{
		if (obj ==null)
		{

			return obj=new Singleton();
			
		}
		else {
			return obj ;
		}

	}


}
public class  SingletonCall
{
	public SingletonCall( )
	{

	}
	public static void main(String [] a)
	{
		SingletonCall obj2=new SingletonCall();
		Singleton obj=Singleton.createObject();
		System.out.println(obj.hashCode());
		Singleton obj1=Singleton.createObject();
		System.out.println(obj1.hashCode());
	}
}
