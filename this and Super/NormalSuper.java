class NormalSuper extends NormalThis
{
	public void modify(int a,int b)
	{
		super.a=a;
		super.b=b;
		
		this.display();
		super.multi();
		super.display();
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);

	}

	public static void main(String[] args) 
	{
		NormalSuper obj=new NormalSuper();
		System.out.println();
		obj.modify(10,20);
		//obj.display();
	}
}
