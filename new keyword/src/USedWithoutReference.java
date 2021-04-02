
public class USedWithoutReference extends Normal {
	USedWithoutReference()
	{
		System.out.println(" default construtor ");
		this.disply(this);
		this.show();
		this.chance();
		super.takeObject(this);
	}
	public void disply( USedWithoutReference obj)///here we can create object  reference bro
												// like we can not passed to another class also;
	{
		System.out.println("disply()");
	}
	public void show() 
	{
		System.out.println("show() ");	
	}
	public void chance()
	{
		System.out.println(" chance()");
	}
	public static void main(String [] args)
	{
		new  USedWithoutReference(); 
	}

}
