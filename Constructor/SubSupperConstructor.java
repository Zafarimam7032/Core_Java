class SupperConstructor 
{
	/*public SupperConstructor()
	{
		System.out.println("no Argumnet SupperConstructor ");
	}*/
	public SupperConstructor (int a){
		System.out.println(" Argument SupperConstructor ");
	}
}
class SubSupperConstructor  extends SupperConstructor
{

	public SubSupperConstructor (int a){
		super(40);
		System.out.println(" Argument SupperConstructor ");
	}
	public static void main(String[] args) 
	{
		//SupperConstructor s= new SupperConstructor(40);
		SubSupperConstructor d= new SubSupperConstructor(40);
	}
}
