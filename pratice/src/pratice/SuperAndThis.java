package pratice;
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
		super(10);
          new SuperAndThis();//this();
		
		//super(10);
	  
	
		System.out.println("calling class for clonstructor:"); 
	}
	public static void main(String [] args) {
	
		SuperAndThis obj=new SuperAndThis(10);
		
	}

}
