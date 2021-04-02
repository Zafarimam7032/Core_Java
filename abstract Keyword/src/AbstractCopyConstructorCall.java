
public class AbstractCopyConstructorCall extends AbstractCopyConstructor {
	
	public AbstractCopyConstructorCall() {
		super();
		
	}

	public AbstractCopyConstructorCall(AbstractCopyConstructor obj) {
		super(obj);// here we passing object here 
		
	}

	public static void main(String [] a)
	{
		AbstractCopyConstructorCall obj=new AbstractCopyConstructorCall();
		obj.name="ZAFAR IMAM";
		obj.age=10;
		obj.salry=1223421;
		obj.phoneNumber=123134411;
		new AbstractCopyConstructorCall(obj);
		System.out.println(obj.getName());
		System.out.println(obj.age);
		System.out.println(obj.phoneNumber);
		System.out.println(obj.salry);
		
		
		
	}

}
