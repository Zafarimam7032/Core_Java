import java.io.File;
class SimpleFileCreated
{
	public static void main(String[]a){
		File obj=new File("G:/Greatwits/Greatwits File pratice/sample.txt");
		try{
		if (obj.createNewFile())
		{
			System.out.println("File Name Created:"+obj.getName());
		}
		}
		catch(Exception e)
		{
		}
}
}