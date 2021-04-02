abstract class NoarmalAbstract 
	{
		public  abstract void display();
		 public void add (int a ,int b, NoarmalAbstract obj)
		{
			 System.out.println("reullt:"+(a+b));
			 obj.mul(10, 20);
			 obj.sub(200,50);
			 obj.div(200,10);
			 
		}
		 public void mul(int a ,int b)
			{
				 System.out.println("reullt:"+(a*b));
			}
		 public void sub(int a ,int b)
			{
				 System.out.println("reullt:"+(a-b));
			}
		 public void div(int a ,int b)
			{
				 System.out.println("reullt:"+(a/b));
			}
		 
		 
	}


	


