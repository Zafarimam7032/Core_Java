
public abstract  class AbstractCopyConstructor 
{
	protected  String name;
	protected  int age;
	protected int salry;
	protected   int  phoneNumber;
	
	public AbstractCopyConstructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	AbstractCopyConstructor(AbstractCopyConstructor obj)
	{
		this.name=obj.name;
		this.age=obj.age;
		this.salry=obj.salry;
		this.phoneNumber=obj.phoneNumber;
		
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int  getSalry()
	{
		return salry;
	}public int getPhoneNumber()
	{
		return phoneNumber;
	}
}
