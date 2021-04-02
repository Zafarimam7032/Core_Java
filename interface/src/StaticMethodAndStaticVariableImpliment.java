
public class StaticMethodAndStaticVariableImpliment implements StaticMethodAndStaticVariable {
	
	public void change(int a)
	{
		//super.c=a; we can not modified  interface variable value its leads compile time error;
		
	}
	public static void display()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodAndStaticVariableImpliment obj=new StaticMethodAndStaticVariableImpliment();
		obj.add();
		StaticMethodAndStaticVariable.mul();
		obj.change(20);
		obj.display();//we can static method by object or without object here but interface method can not call only its call by interface class name
		StaticMethodAndStaticVariable obj1=new StaticMethodAndStaticVariableImpliment();
		obj1.add();
		StaticMethodAndStaticVariable.mul();
	}

}
