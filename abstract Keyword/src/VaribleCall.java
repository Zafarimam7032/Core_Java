
public class VaribleCall extends VariableInAbstructClass{
	public void display()
	{
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
		System.out.println(h);
		System.out.println(i);
//		System.out.println(obj.t);// both are private so it can not accesss outside the the psckage
//		System.out.println(w);
	}
public static void main(String [] a)
{
	 VaribleCall obj=new  VaribleCall();
	// obj.add();
	 obj.add(obj);
	 System.out.println("==========================================");
	 obj.a=40000;
	 obj.display();
}
}
