package thread;

public class ThreadCreate  {
 public static void main(String [] a)
 {
	 Thread obj=new Thread(new Runnable() {
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
	 }
			 );
	 obj.start();
 }
 
}
