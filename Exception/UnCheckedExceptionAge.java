



class UserDefineException1 extends RuntimeException 
{
	UserDefineException1(){
	}
	UserDefineException1(String a)
	{
		super(a);
	}

}
public class UnCheckedExceptionAge
{
	public  static void main(String [] a)
	{
	 try
	 {
		int age=15;
		if (age<18)
		{
			throw new UserDefineException1("hello  you are eligible mr");
		}
		else
		 {
			System.out.println("person eligible for vote");
		 }
	 }
	 catch ( UserDefineException1 e )
	 {
		 System.out.println(e);
	 }
	}
}

