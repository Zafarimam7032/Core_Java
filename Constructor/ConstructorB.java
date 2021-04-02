 class ConstructorAbc
{
	 private  ConstructorAbc()
	 {
		 
	 }
 ConstructorAbc(int a)
	{
		System.out.println(" Default Constructor ConstructorA");

	}
}
class ConstructorB extends ConstructorAbc
	{
		public ConstructorB()
		{
			super(10);
			System.out.println(" Default Constructor of ConstructorB");
		}
	

	public static void main(String[] args) 
	{
		//System.out.println("main method");
		//ConstructorA a=new ConstructorA();
		//ConstructorB obj=new ConstructorB();
	}
}
class ConstructorC extends ConstructorB{
	public ConstructorC()
	{
		System.out.println("Default of constructor ConstructorC ");
	}
	public static void main(String [] args)
	{
		ConstructorC d=new ConstructorC();
	}
}