class NonStaticBlock 
{
	{
		System.out.println("First non Static method");
	}
	{
		System.out.println("second non Static method");
	}
	{
		System.out.println("third non Static method");
	}
	{
		System.out.println("fourth non Static method");
	}
	{
		System.out.println("Five non Static method");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		NonStaticBlock v= new NonStaticBlock();
	}
}
