import java.util.Scanner;
class ReadValueFromUser{
       public static void add()
       {
                Scanner s= new Scanner(System.in);
		System.out.print("enter the first number:");
		int a=s.nextInt();
		System.out.print("enter the Second number:");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("Result:"+c);
       } 
	public static void main(String [] args)
	{
	
	add();
	}
}