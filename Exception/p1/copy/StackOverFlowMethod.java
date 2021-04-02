package p1.copy;
class StackOverFlowMethod 
{
	public static void main(String[] args) 
	{
		display(10,20);
	}
	public static void display(int a ,int b)
	{
		int i=0;
		i++;
		if(i==10)
		{
		
		System.exit(0);
		}
		else
		{
		System.out.println(a*b);
		display(10,20);
		}
		
	}
}
