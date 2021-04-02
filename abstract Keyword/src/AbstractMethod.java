
public abstract class AbstractMethod   {
   public abstract  void add();
   public abstract  void mul(int a,int b);
   protected  abstract  void div();
   public abstract  void sub();
   protected abstract void display();
   abstract int count(); //we can create abstract default method
  // private abstract void call();//private is not allowed because we have to override that method
  // public abstract static void show1();//we can not create static abstract method because we have to override;
   public void show()
   {
	System.out.println("display() method of abstract class ");   
   }
   public static void display1()//static method allow inside abstract class
   {
		System.out.println("display1()  static method of abstract class ");   

   }
   
   
}

