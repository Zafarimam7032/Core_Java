class ParameterCall 
{	    
	//p ublic void display(static int a)
	//{ modifer is not allowed inside formal parameter
	//}
	public void display(int a)// a variable is local varible because we are multiple varible same type322021
	{
		System.out.println(a);
	}
	public static void displayStatic(int a){
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		ParameterCall p =new ParameterCall();
		p.display(10);
		displayStatic(20);
	}
}
