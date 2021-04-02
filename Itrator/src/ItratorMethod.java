import java.util.ArrayList;
import java.util.Iterator;

public class ItratorMethod {
 public static void main(String[] args) {
	ArrayList<Integer> arobj=new ArrayList<Integer>();
	arobj.add(1);
	arobj.add(2);
	arobj.add(3);
	arobj.add(4);
	arobj.add(5);
	arobj.add(6);
	arobj.add(7);
	Iterator<Integer> onjitr=arobj.iterator();// here arobj is collection object 
		while(onjitr.hasNext())
		{
				System.out.println(onjitr.next());
		}
		
}
}
