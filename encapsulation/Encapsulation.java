class Encapsulation 
{
	private int A;
	private int B;
	public int getA()
	{
		return A;
	}
	public int getB()
	{
		return B;
	}
	public void seta(int a)
	{
		this.A=a;
	}
	public void setb(int b)
	{
		this.B=b;
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		Encapsulation e=new Encapsulation();
		e.seta(10);
		e.setb(20);
		System.out.println("A:"+e.getA()+"\nB:"+e.getB());
	}
}
