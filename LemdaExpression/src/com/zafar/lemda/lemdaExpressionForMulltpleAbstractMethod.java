package com.zafar.lemda;

public class lemdaExpressionForMulltpleAbstractMethod {
 public static void main(String[] args) {
	 MultipleInterface obj = new MultipleInterface() {
		
		@Override
		public void show() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void display() {
			// TODO Auto-generated method stub
			
		}
	};

	obj.display();
	obj.show();
}
}
