class ObjectPass 
{
	public void display()
	{
		System.out.println("display() method");
	}
	public static void show( ObjectPass obj)//getting object
	{
		System.out.println("show() method");
		obj.display();//calling instance method;
	}
	public void passObject()
	{
		System.out.println("passObject() method");
		show( this);//here passing object as a Argument;
	}
	public static void main(String[] args) 
	{
		ObjectPass obj=new ObjectPass();
		obj.passObject();
		
	}
}
