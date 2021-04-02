public class  ObjectCallFromAnotherClass
{
	static ObjectCreate obj=new ObjectCreate();
	//obj.ObjectDisplay();// identifier expected
	ObjectCreate obj1=new ObjectCreate();
	//obj1.ObjectDisplay(); identifier expected  
	final ObjectCreate obj2 =new ObjectCreate();
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		ObjectCallFromAnotherClass d= new ObjectCallFromAnotherClass();
		obj.ObjectDisplay();
		d.obj1.ObjectDisplay();/* if i,m not creating object here then it throwing error 
									{ obj1 and obj2 saying it is non static varible}  */
		d.obj2.ObjectDisplay();
	}
}
