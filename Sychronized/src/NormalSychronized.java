
public class NormalSychronized extends Thread {
	 synchronized public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("number:"+i);
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		
	}
	public static void main(String[] args) {
		NormalSychronized obj=new NormalSychronized();
	obj.start();
		NormalSychronized obj1=new NormalSychronized();
		//obj.start();
		obj1.start();

	}

}
