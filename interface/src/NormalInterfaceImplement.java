
public class NormalInterfaceImplement implements NormalInterface{
	public void display()
	{
		System.out.println("dispay() method");

	}
	public void show()
	{
		System.out.println("show() method ");
	}
	public void add()
	{
		System.out.println("add() method ");
	}
	
	public static void main(String []  args )
	{
		 NormalInterfaceImplement obj=new NormalInterfaceImplement();
		 obj.display();
		 obj.show();
	}

}
