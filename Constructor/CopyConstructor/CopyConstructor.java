package CopyConstructor;


public class CopyConstructor {

	protected  String name;
	protected  int age;
	protected int salry;
	protected   int  phoneNumber;
	
	public CopyConstructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CopyConstructor(CopyConstructor obj) {
	this.name=obj.name;
	this.age=obj.age;
	this.salry=obj.salry;
	this.phoneNumber=obj.phoneNumber;
	System.out.println(name);
	System.out.println(age);
	System.out.println(salry);
	System.out.println(phoneNumber);
		
	}
	public static void main(String [] a) {
		CopyConstructor obj=new CopyConstructor();
		obj.name="zafar imam";
		obj.age=19;
		obj.salry=1223421;
		obj.phoneNumber=1231344;
		new CopyConstructor(obj);
		
		
		
		    
	}
	
	
	
}
