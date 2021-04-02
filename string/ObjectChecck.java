
public class ObjectChecck {
	String name=new String("Zafar imam");
	String name1=new String("Zafar imam");
	public void check()
	{
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		int c=name.hashCode();
		int d=name1.hashCode();
		System.out.println(c==d);
		System.out.println(name.equals(name1));
	}
	public static void main(String[] args) {
		ObjectChecck obj=new ObjectChecck();
		obj.check();
	}

}
