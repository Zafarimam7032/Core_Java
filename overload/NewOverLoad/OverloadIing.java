package NewOverLoad;

public class OverloadIing {
	public void userInput(String name ,String password,int age,double salry,String dob)
	{
		System.out.println("user name:"+name);
		System.out.println("password:"+password);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salry);
		System.out.println("date of birth :"+dob);
		int a=userInput(22);
		System.out.println("Age:"+a);
		
	}
	public static void userInput(String name,String password ) //static or non static no matter for overloading concept
	{
		System.out.println("user name:"+name);
		System.out.println("password:"+password);
		
	}
	public int userInput(int age)// return can be also different in overloading concept
	{
		return age;
	}
	public static String userInput(String dob)//return type with static or non static can also different 
	{
		userInput("Zafar imam","password");
		return dob;
		
	}
	protected static void userInput(Boolean check, String name ,String password,int age,double salry,String dob)// datatupe can aslo check bro
	{
		System.out.println("user is valdatating :"+check);
	
		if(check==true) {
		
		System.out.println("user name:"+name);
		System.out.println("password:"+password);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salry);
		System.out.println("date of birth :"+dob);
		}
		else
		{
			System.out.println("not valid user here");
		}
		
	}
	private  void userInput(String name,int age)// we can add all four access modifier  in overload concept
	{
		System.out.println("user name:"+name);
		System.out.println("Age:"+age);
	}
	void userInput()// we can also overload without passing any argument 
	{
		System.out.println("No Arugument method call");
		userInput("Zafar imam",22);
		userInput(12123213.0,"password");
	}
	public void userInput(Double salry,String password) // we can sequence of data type to overload method
	{
		System.out.println("Salry:"+salry);
		System.out.println("Password:"+password);
	}
	public static void main(String [] a)
	{
		 OverloadIing obj=new  OverloadIing();
		 obj.userInput("Zafar imam", "21324", 22, 234214, "05/02/1998");
		 userInput(true,"Zafar imam", "21324", 22, 234214, "05/02/1998");
		 userInput(false,"Zafar imam", "21324", 22, 234214, "05/02/1998");
		 userInput("05/02/1998");
		 obj.userInput();
		 

	}
}
