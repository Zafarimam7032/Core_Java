class Mixer Method 
{
	static int a=400;
	static String b="Zafar";
	public static void display(){
		System.out.println(a+" "+b);
		

	}
	public void displayNon()
	{
		System.out.println(a+" "+b);
		display();
		
		
	}
}
class  MixerMethodCall extends MixerMethod
{
	 void method(){
		 MixerMethod  d =new MixerMethodCall();
		 d.displayNon();
	 }

	public static void main(String[] args) 
	{
		System.out.println("main method");
		
		MixerMethodCall e= new MixerMethodCall();
		e.method();
		
	}
}
