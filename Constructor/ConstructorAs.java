public class ConstructorAs 
{
	private ConstructorAs()
	{
			System.out.println("private ConstructorAs ");
	}
	public static void main(String[] args) 
	{
		ConstructorAs a=new ConstructorAs ();
	}
}
