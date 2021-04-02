package NewOverLoad;

public class OverLoadAnother extends OverloadIing {
	private  void userInput(String name,int age)
	{
		System.out.println("user name:"+name);
		System.out.println("Age:"+age);
	}
	public static void main(String [] args)
	{
		OverLoadAnother obj=new OverLoadAnother();
		obj.userInput("zafar",22);
		OverloadIing obj1=new OverLoadAnother();
		obj1.userInput(20);
	}

}
