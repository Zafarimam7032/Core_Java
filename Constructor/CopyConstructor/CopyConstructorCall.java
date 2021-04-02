package CopyConstructor  ;

public class CopyConstructorCall extends CopyConstructor {

	public static void main(String[] args)  {
		CopyConstructorCall obj=new CopyConstructorCall();
		obj.name="Sbobit";
		obj.age=10;
		obj.salry=1223421; 
		obj.phoneNumber=123134411;
		new  CopyConstructor(obj);
		
			

	}

}
