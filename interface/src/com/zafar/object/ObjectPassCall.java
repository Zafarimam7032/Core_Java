package com.zafar.object;

public class ObjectPassCall implements ObjectPass {
	public static void main(String[] args) {
		ObjectPass obj=new ObjectPassCall();
		obj.add();
		obj.show();
		obj.method();
		ObjectPass.objectTake(obj);
		ObjectPassCall obj1=new ObjectPassCall();
//		obj1.create();// static method of interface call only by using interface class name 
//		obj.create();

		
		
	}

}
