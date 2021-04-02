class ToString 
{
	public static void main(String[] args) 
	{
		try
		{
			int a=404;
			int b=0;
			int c=a/b;
			System.out.println("Result"+c);

		}
		catch (Exception e)
		{
			System.out.println(e.toString());// it will print exception in exception name aand description
		}
		
	}
}
