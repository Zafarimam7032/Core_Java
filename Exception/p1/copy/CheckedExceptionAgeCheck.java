package p1.copy;


class UserDefineException extends Exception 
{
	UserDefineException()
	{
		super();
	}
	UserDefineException(String a)
	{
		super(a);
	}
}
public class CheckedExceptionAgeCheck
{
	public static void main(String [] a)
	{
		try
		{
			int age =17;
			if(age<18)
			{
					throw new UserDefineException("please pass greater the 18 ");
					//throw new UserDefineException();
				
			}
			else
			{
				System.out.println("person is eligible for vote");
			}

		}
		catch (UserDefineException e)
		{
			System.out.println(e);
		}
	}
}
