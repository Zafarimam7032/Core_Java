package  com.Mprct.p2;

public class  OverRideProtected extends NormalOverRide 
{
	// void show()// can not use default acces specifier below as protected specifier 
	//{
	//	System.out.println("NormalClass show()");
	//}
	protected void show()
	{
		System.out.println("OverRideProtected show()");
	}
	protected void check()//  here can use above deafult protected
	{
		System.out.println("OverRideProtected check()");
	}
	public static void main(String [] a)
	{
		OverRideProtected obj=new OverRideProtected();
		obj.show();
		obj.check();
	}

}
/* for override concept acessspecifier is 
****{public < defult< protected }****
*/