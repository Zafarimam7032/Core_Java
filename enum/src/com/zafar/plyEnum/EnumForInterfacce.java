package com.zafar.plyEnum;

public enum EnumForInterfacce  implements InterfaceForEnumCheck// enum can inheritance only interface 
{
	obj;

	@Override
	public void display() 
	{
		System.out.print("hello are you mirs");
	}

}
