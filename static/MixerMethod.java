class MixerMethod 
{
	static int a=400;
	static String b="Zafar";
	public static void display(){
		System.out.println(a+" "+b);
		MixerMethod n =new MixerMethod();
					n.displayNon();
		

	}
	public void displayNon()
	{
		System.out.println(a+" "+b);
		//display();
		
		
	}
	public static void main(String [] a)
	{
		display();
		//StaticAndNonStatic.display();
	}
}