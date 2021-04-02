class ThisConstructor 
{
	public ThisConstructor( ThisConstructorCall obj3)
	{
		System.out.println("defult  constructor of ThisConstructor ");
		obj3.add();
	}
	public void display()
	{
		System.out.println("display() of ThisConstructor");

	}
	
}
class ThisConstructor1
{
	public ThisConstructor1(ThisConstructorCall obj,int a,int b)
	{
		System.out.println("int a,int b of ThisConstructor1 ");
		obj.add();
	}
}
public class ThisConstructorCall
{
	public ThisConstructorCall ()
	{
		ThisConstructor obj=new ThisConstructor(this);
		ThisConstructor1 obj4=new ThisConstructor1(this,10,30);
		obj.display();
		
	}
	public void add()
	{
		System.out.println("add() of ThisConstructorCall");
	}
	public static void main(String[] args) 
	{
		ThisConstructorCall obj1=new ThisConstructorCall();
		//obj1.add();
		System.out.println("");
	}
}
