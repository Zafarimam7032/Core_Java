package com.zafar.normal;

public  abstract class AbstractBlock {
	{												// instance block is allowed inside the abstract class
		System.out.println("instance block of AbstractBlock ");
	}
	static {											// static block is allowed inside the abstract
		System.out.println("static block of AbstractBlock ");
	}

}
