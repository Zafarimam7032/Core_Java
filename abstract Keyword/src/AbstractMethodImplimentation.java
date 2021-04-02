
public class AbstractMethodImplimentation extends AbstractMethod {
	   public   void add() {
		   System.out.println("Add() method");
	   }
	   public   void mul(int a,int b)
	   {
		   System.out.println("mul(int a,int b) method");

	   }
	   public  void sub()//in override concept default is greater then protected
	   {
		   System.out.println("sub() method");

	   }
	   protected   void div()
	   {
		   System.out.println("div() method ");

	   }
	   public void display()
	   {
		   System.out.println("display() methed");

	   }
	   protected int count()
	   {
		   System.out.println("count() method");

		   return 0;
	   }


	
	public static void main(String [] a)
	{
		AbstractMethodImplimentation obj=new AbstractMethodImplimentation();
		obj.add();
		obj.mul(10,10);
		obj.div();
		obj.display();
		obj.count();
		obj.show();
		display1();
	}

}
