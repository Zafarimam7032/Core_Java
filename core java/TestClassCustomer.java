class StaticBlock 
{
	{
		System.out.println("non Static block");
	}
	static {
		System.out.println("Static block");
	}
	static {
		System.out.println("Seconfd static block");
	}
	static {
		System.out.println("third static block");
	}
	static{
		System.out.println("froth static block");
	}
	
	public static void main(String[] args) 
	{
		StaticBlock b=new StaticBlock();
		//System.out.println("Hello World!");
	}
}
