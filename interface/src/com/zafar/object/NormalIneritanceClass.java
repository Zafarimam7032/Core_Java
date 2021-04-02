package com.zafar.object;

public class NormalIneritanceClass implements NormalIInheritance {
	int a=30;
	int b=40;
	
	public void add() {
			System.out.println("Addition:"+(a+b));
	}

	
	public void sub() {
		System.out.println("Subtraction:"+(a-b));
		
	}

	
	public void mul() {
		System.out.println("Multipication:"+(a*b));
		
	}

	
	public void div() {
		System.out.println("Divion:"+(a/b));
		
	}
	public static void main(String[] args) {
		NormalIInheritance obj=new NormalIneritanceClass();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div(); 
	}

}
