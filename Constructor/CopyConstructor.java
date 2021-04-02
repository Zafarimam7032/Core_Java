
public class CopyConstructor {
    private String name;
    private int age;
    private double salry;
    CopyConstructor(){
    	super();
    	
    }
	public CopyConstructor(CopyConstructor obj) {
		//super();
		name =obj.name;
		age=obj.age;
		salry=obj.salry;
		
			}
	public static void main(String [] args)
	{
		
		CopyConstructor obj=new CopyConstructor();
		obj.name="zafar";
		obj.age=19;
		obj.salry=1232214;
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salry);
		
	}
    
}
