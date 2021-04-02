package thread;

public class NormalThread extends Thread {
	public void run()
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("hello "+i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			}
		}
	
	public static void main(String [] a)
	{
		NormalThread obj=new NormalThread();
		obj.start();
		NormalThread obj1=new NormalThread();
		obj1.start();
	}

}
