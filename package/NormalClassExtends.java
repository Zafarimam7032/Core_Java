package  com.Mprct.p1;

class   NormalClassExtends extends NormalClass
{
	public static void main(String[] args) 
	{
		System.out.println(" main method of NormalClassExtends");
		NormalClass obj=new NormalClass();
		obj.display();
		obj.show();
		obj.check();
		//obj.method();// it has private specifier so i can not acces out side the  classs
	}
}
