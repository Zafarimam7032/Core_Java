import java.util.*; 
class StringImutable 
{
	public static void main(String[] args) 
	{
		HashMap< String,Integer> s = new HashMap<String,Integer>();
			String d="hello";
			s.put(d,1);
			s.put("hi",2);
			s.put("h",3);
			s.put("he",4);
			s.put("she",5);
			System.out.println(s.get("hello"));//1

			d="Hello";
			System.out.println(s.get("Hello"));//null wil be print value can not be modified

	}
}
