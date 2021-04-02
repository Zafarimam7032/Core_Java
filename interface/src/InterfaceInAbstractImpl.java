
public class InterfaceInAbstractImpl implements InterfaceInAbstract {

	
	public void display() {
		System.out.println("  display() method of  InterfaceInAbstract");
	}

	
	public void show() {
		System.out.println(" show() method of  InterfaceInAbstract");

	}

	
	public void arm() {
		System.out.println("arm() method of  InterfaceInAbstract");

	}
	public static void main(String[] args) {
		InterfaceInAbstract obj=new InterfaceInAbstractImpl();
		obj.display();
		obj.show();
		obj.arm();
	}

}
