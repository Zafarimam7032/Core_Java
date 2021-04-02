package com.var.vrcl;
import com.var.cl.*;

public class ImportVriable extends InstanceVariable {
	public static void main(String[] args) {
		ImportVriable obj=new ImportVriable();
		obj.display();
		obj.name="imam";
		obj.age=22;
		//obj.number=234.34; we con't not accesss  default  
		//obj.ch='a'; obviously we not access private outside the class then obviously package also 
		System.out.println("======================================");
		System.out.println("Name:"+obj.name);
		System.out.println("Age:"+obj.age);
	}

}
