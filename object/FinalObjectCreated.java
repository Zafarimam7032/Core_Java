class FinalObjectCreated 
{
	public static void main(String[] args) 
	{
		System.out.println("FinalObjectCreated  main method");
		ObjectClass obj=new ObjectClass();
		obj.a=20;
		obj.name="delhi";
		System.out.println(obj.a);
		System.out.println(obj.name);
		obj.a=50;
		obj.name="Hyderabad";
		System.out.println(obj.a);
		System.out.println(obj.name);
		final ObjectClass obj1=new ObjectClass();// obj1 is final but its content is not final
		obj1.a=200;								// thats why its value is changing this is simple and easy
		obj1.name="america";
		System.out.println(obj1.a);
		System.out.println(obj1.name);
		obj1.a=2000;
		obj1.name="newyark";
		System.out.println(obj1.a);
		System.out.println(obj1.name);
		obj=obj1;// here possible because obj is normal varible
		//obj1=obj;// here not posible because obj1 is final its value cannot be change
				// thats why its throwing error that obj1 is final its value can not be change
				// modify

	}
}
