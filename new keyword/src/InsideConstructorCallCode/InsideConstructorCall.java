package InsideConstructorCallCode;

public class InsideConstructorCall {
	public InsideConstructorCall(Zafar obj) {
		obj.show1();
	}
	public void display()
	{
		System.out.println("Zafar you got it ");
	}

	public static void main(String [] a)
	{
		 InsideConstructorCall obj=new  InsideConstructorCall(new Zafar()
		{
			 
			public void show()
			 {
				 System.out.println("zafar you have created bro this ");
			 }
			 			 
			 //obj.
		});
		 obj.display();
		 
		 
	}

}
