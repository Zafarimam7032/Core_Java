package pratice;

import java.util.Scanner;

public class StudentCount 
{
	int count;
	
	public static void main(String[] a) 
	{
		
		Scanner s=new Scanner(System.in);
		StudentCount obj=new StudentCount();
		System.out.print("how many student Name you want to inseart:");
		int n=s.nextInt();
		s.nextLine();
		String []name=new String[n];
		System.out.println("enter the Student Name");
		for(int i=0;i<n;i++)
		{
			name[i]=s.nextLine();
		}	
		
		for(int i=0;i<n;i++)
		{
			obj.count=0;
			for(int j=i;j<n;j++)
			{
				if(name[i].equals(name[j])) 
				{
					obj.count=obj.count+1;
				}
			}
			for(int j=i;j<n;j++)
			{
				if(name[i].equals(name[j])) 
				{
					//name[i]=
				}
			}
				
	
			
			System.out.println(name[i]+"="+obj.count);
		}
	}
}


