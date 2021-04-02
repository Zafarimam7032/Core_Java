
public class NormalNew {
	private String name;
	private int age;
	private double salry;
	public void userInformation(String name,int age,double salry) {
		this.name=name;
		this.age=age;
		this.salry=salry;
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.salry);
	}
	

	public static void main(String[] args) {
		NormalNew obj=new NormalNew();
		obj.userInformation("Zafar imam", 20, 121121.0);
	}

}
