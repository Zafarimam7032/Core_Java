import java.util.*;
class ArrayValue 
{ 
	int [] a=new  int[8];
	String [] b=new String[5];
	public static void main(String[] args) 
	{
		ArrayValue obj=new ArrayValue();
		obj.a[0]=1;
		obj.a[5]=2;
		//obj.a[8]=6;
		for (int i=0;i<8 ;i++ )
		{
			System.out.print(" "+obj.a[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(obj.a));
		System.out.println(Arrays.toString(obj.b));//for printing String arra we can use both deepToString or toString 
		System.out.println(Arrays.deepToString(obj.b));//both is possible
	}
}
