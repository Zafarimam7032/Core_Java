class ClassCall extends NormalClass
{
	public static void add()
	{
		System.out.println(" ClassCall add()");
		NormalClass obj=new NormalClass();
		obj.display();
	}
	public void ClassCallmethod()
	{
		super.display();	
		this.display();
	}
	public void display()
	{
		System.out.println(" ClassCall add()");
	}
	public static void main(String[] args) 
	{
		ClassCall obj1=new ClassCall();
		obj1.ClassCallmethod();
		//add();
	}
}
