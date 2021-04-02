 class ConstructorAbb 
{
	public ConstructorAbb()
	{
		System.out.println(" Default Constructor ConstructorA");

	}
}
class ConstructorBbc extends ConstructorA
	{
		public ConstructorBbc()
		{
			System.out.println(" Default Constructor of ConstructorB");
		}
	

	public static void main(String[] args) 
	{
		//System.out.println("main method");
		//ConstructorA a=new ConstructorA();
		ConstructorBbc b=new ConstructorBbc();
	}
}
class ConstructorCcd extends ConstructorAbb{
	public ConstructorCcd()
	{
		System.out.println("Default of constructor ConstructorC ");
	}
	public static void main(String [] args)
	{
		ConstructorAbb d=new ConstructorCcd();
	}
}