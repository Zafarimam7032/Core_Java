class DefualtConstructor 
{
	
}
class ConstructorAde extends DefualtConstructor
{
	public ConstructorAde(){
	}
	public ConstructorAde(int a){
		System.out.println("ConstructorAde");
	
}
}
class DConstructor extends ConstructorAde
{

	public static void main(String s[])
	{
		ConstructorAde a=new ConstructorAde(40);
}
}
