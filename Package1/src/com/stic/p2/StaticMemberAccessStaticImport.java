package com.stic.p2;
import static com.stic.p1.StaticMember.*;// we can not extends any class if you are using static import
//import com.stic.p1.StaticMember;// for extends we have to import instance package 
public class StaticMemberAccessStaticImport  // extends StaticMember if you want to access protected member for that we have to EXtends 
{
	public static void main(String[] args) {
		display();// without extending we can access public member 
		//show();// for accessing static protected member we have to extends that class brother
		
	}

}
