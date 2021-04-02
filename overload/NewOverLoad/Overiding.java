package NewOverLoad;

public class Overiding {
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
	public int userInput(int age)
	{
		return age;
	}
	public void display()
	{
		System.out.println("display method  Overiding class");
	}
	public void show()
	{
		System.out.println("show() method  Overiding class");
	}
	public int add()
	{
		int a=30;
		int b=40;
		return (a+b);
	}
}
