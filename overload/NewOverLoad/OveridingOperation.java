package NewOverLoad;

public class OveridingOperation extends Overiding {
	public void display()
	{
		System.out.println("display() method of OverloadOeration");
	}
	public void show()
	{
		System.out.println("show() method   OveridingOperation class");
	}
	public int add()
	{
		int a=30;
		int b=40;
		return (a+b);
	}
public static void main(String [] a)
{
	 OveridingOperation obj=new  OveridingOperation();
	 obj.display();
	 obj.show();
	int c= obj.add();
	System.out.println("Result:"+c);
	// accessing only parent class object here brother
	 Overiding obj1=new  Overiding();
	obj1.display();
	obj1.show();
	obj.userInput("zafar", "password", 22, 2133312, "05/02/1998");
	//dynamic binding here
	Overiding obj2=new  OveridingOperation();
	obj2.display();//here compile time its checking parent class display but executing child class display method
	obj2.show();
	
}
}
