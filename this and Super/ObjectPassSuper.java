class ObjectPassSuper extends NormalClass
{
	public void display()
	{
		System.out.println("display() method of ObjectPassSuper");
		super.takeObject(this);
		//super.add(10,20);
	}
	public static void main(String[] args) 
	{
		ObjectPassSuper obj =new ObjectPassSuper();
		obj.display();
		//System.out.println("");
	}
}
