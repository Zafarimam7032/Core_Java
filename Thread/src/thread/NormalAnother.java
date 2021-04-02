package thread;

public class NormalAnother implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<4;i++)
		{
			System.out.println("hello "+i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String [] a)
	{
		 NormalAnother obj1=new NormalAnother();
		Thread obj=new Thread(obj1);
		// new NormalAnother();
		obj.start();
	}
	
	

}
