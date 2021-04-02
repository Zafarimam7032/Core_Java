
public class AbstractConstructorCall extends  AbstractConstructor {
//	AbstractConstructorCall()
//	{
//		//super(10);
//		System.out.print("AbstractConstructorCall()");
//	}
	AbstractConstructorCall(int a)// if you want to call specific constructor of abstract class then create same pram constructor then call from that constructor  
	{
		super(a);
	
	}
	
	
	public static void main(String []a) {
		// new  AbstractConstructorCall();
		 new  AbstractConstructorCall(10);
		
		
	}

}
