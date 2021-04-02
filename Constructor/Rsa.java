class Abc
{
	
}
class Def
{
	Def(int q)
	{
		System.out.println("int a");
	}
}
class Rsa extends Def
{
	Rsa(){
		super(50);
		System.out.println("Rsa");

	}
	public static void main(String [] s)
	{
		Rsa a= new Rsa();
	}
}