class ConstructorAC{
	public ConstructorAC(){
		this(10,20);

			System.out.println("public Constructor");
			

	}
	private ConstructorAC(int a,int b){
		this(3.0f,30);
			System.out.println("private Constructor");

	}
	
	ConstructorAC(float d, int  c){
		 this(2,"hello");
			System.out.println("Defualt Constructor");

	}
	
	protected ConstructorAC(int d, String a){
			System.out.println("protected Constructor");

	}
	
	
	public static void main(String[] args) 
	{
		ConstructorAC ac=new ConstructorAC();
	}
}
