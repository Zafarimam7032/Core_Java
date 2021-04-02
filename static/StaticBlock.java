class StaticBlock 
{
	static
	{
		System.out.println("first static method");
	}
	static
	{
		System.out.println("Second static method");
	}
	static
	{
		System.out.println("third static method");
	}
	static
	{
		System.out.println("fourth static method");
	}
	static
	{
		int a=40;
		int b=20;
		System.out.println("Result: " +(a+b));
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
	}
}
