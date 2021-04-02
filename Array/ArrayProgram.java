import java.util.*;
class ArrayProgram 
{
	int [] array={1,3,4,5,6,6,7};
	float [] array1=new float[10];
	char [] array2=new char[10];
	double [] array3=new double[10];
	String [] array4={"a","b"};//new String[10];

	public static void main(String[] args) 
	{
		ArrayProgram obj=new ArrayProgram();
		//obj.array[1]=1;
		obj.array[0] = 11;
		System.out.println(Arrays.deepToString(obj.array4));
					//System.out.println(Arrays.deepHashcode(obj.array));
		//System.out.println(Arrays.toString(obj.array));
		for(int i=0;i<7;i++)
		{
			System.out.print(" "+obj.array[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(obj.array));
		//obj.array={1,3,4,5,6,6,7};
		
	}
}
