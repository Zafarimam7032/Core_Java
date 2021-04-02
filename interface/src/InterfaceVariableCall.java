
public class InterfaceVariableCall implements InterfaceVariable{
	int a=300;
	int b=400;
	int e=500;
	int f=4000;
	public static void main(String[] args) {
		InterfaceVariableCall obj=new InterfaceVariableCall();
		System.out.println("=======InterfaceVariableCall==========");
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.e);
		System.out.println(obj.f);
		InterfaceVariable obj1=new InterfaceVariableCall();
		System.out.println("=======InterfaceVariable by calling object==========");
		System.out.println(obj1.a);// but this is bad practice as you know that interface is created by default is created static field{a,b,e,f}
		System.out.println(obj1.b);
		System.out.println(obj1.e);
		System.out.println(obj1.f);
		System.out.println("=======InterfaceVariable by calling class name=====");
		System.out.println(InterfaceVariable.a);
		System.out.println(InterfaceVariable.b);
		System.out.println(InterfaceVariable.e);
		System.out.println(InterfaceVariable.f);
	}

}
