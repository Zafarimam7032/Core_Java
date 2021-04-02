class Declare 
{
	static int a;
	static int b;
	static void method(){
	b=40;
	System.out.println("B:"+b);
	}
	public static void main(String[] args) 
	{
		a=30;

		for (int i=0;i<1 ;i++ )
		{
			System.out.println("hello");
		}
		method();
		System.out.println("A:"+a);
		
		
	}
}
