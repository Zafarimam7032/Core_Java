class Super
{
	Super()
	{
		System.out.println("Super call  default constructor");
	}
	Super(int a)
	{
		System.out.println("Super call constructor");
	}
	
}

public class SuperAndThis  extends Super {
	public SuperAndThis(){
		System.out.println("SuperAndThis Constructir");
	}
	public SuperAndThis(int a)
	{
		this();// i,m calling here SuperAndThis default constructor
		Super obj1=new Super(10);// here super class constructor like {super(10);}
		/*above basically calling two constructor*/
		System.out.println("calling class");
	}
	public static void main(String [] args) {
	
		SuperAndThis obj=new SuperAndThis(10);
		
	}

}
