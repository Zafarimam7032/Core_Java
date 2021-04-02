class ConstructorD 
{
	public ConstructorD(){
		this(13,40);
		System.out.println("ConstructorD Defualt constructor");
		//this(13,40);// we can not call construct at the buttom because it will throw error 
	}
	public ConstructorD(int a, int b)
	{
		this("Hello",40);
		System.out.println("int a and int b constructor");
	}
	public ConstructorD(String a, int b)
	{															
		System.out.println("String a int b Constructor");
	}
	public static void main(String[] args) 
	{
		ConstructorD s=new ConstructorD();
	}
}
/* contruct excute buttom to up according to call */