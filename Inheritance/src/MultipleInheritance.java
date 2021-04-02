
public class MultipleInheritance implements Parent,Parrent1 {
	public void add()
	{
		System.out.println("add() method  ");
	}
	public void mul()
	{
		System.out.println("add() method  ");
	}
	public static void main(String [] a)
	{
		MultipleInheritance obj=new MultipleInheritance();
		obj.add();
		obj.mul();
		
	}

}
