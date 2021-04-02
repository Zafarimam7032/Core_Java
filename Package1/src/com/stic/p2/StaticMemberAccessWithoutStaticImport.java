package com.stic.p2;
import com.stic.p1.*;// normal importing  
public class StaticMemberAccessWithoutStaticImport  extends StaticMember {
	public static void main(String[] args) {
		
		StaticMember.display();// without extending we can access public member 
		StaticMember.show();// for accessing static protected member we have to extends that class brother
		
		//show();
		//StaticMember obj1=new StaticMemberAccessWithoutStaticImport();
		
		
	}

}
