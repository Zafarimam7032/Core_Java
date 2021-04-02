 class ConstructorAb
{
	public ConstructorAb()
	{
		System.out.println(" Default Constructor ConstructorA");

	}
}
class ConstructorBc extends ConstructorAb
	{
		public ConstructorBc()
		{
			System.out.println(" Default Constructor of ConstructorB");
		}
	

	public static void main(String[] args) 
	{
		//System.out.println("main method");
		//ConstructorA a=new ConstructorA();
		ConstructorB b=new ConstructorB();
	}
}
class ConstructorCc extends ConstructorAb{
	public ConstructorCc()
	{
		System.out.println("Default of constructor ConstructorC ");
	}
	public static void main(String [] args)
	{
		ConstructorAb d=new ConstructorCc();
		//ConstructorC d=new ConstructorA(); we can not create object of create of chils to prrent 
	}
}