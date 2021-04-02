package com.zafar.normal;

public class AbstractClassCalling extends AbstractBlock{
	{
		System.out.println("instance block of AbstractClassCall ");
	}
	static {											
		System.out.println("static block of AbstractClassCall");
	}

	public static void main(String[] args) {
		//AbstractClassCall obj=new AbstractClassCall();
		System.out.println("==========================================================");
		//AbstractBlock obj1=new AbstractClassCall();
		
	}					
	

	 
}
/* ==========================out put==================================
static block of AbstractBlock 
static block of AbstractClassCall
instance block of AbstractBlock 
instance block of AbstractClassCall 
*/