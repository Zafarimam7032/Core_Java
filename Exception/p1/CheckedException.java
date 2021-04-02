package p1;

class UserDefineException extends Exception // checked exception declaration
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
public class CheckedException
{
	public static void main(String [] a)
	{
		try
		{
			int age =17;
			if(age<18)
			{
					//throw new UserDefineException("please pass greater the 18 ");// here we are calling paramconstrutor 
					throw new UserDefineException();// here can not pass argument  here calling default constructor
				
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
