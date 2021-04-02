package com.ord.pojo;

import java.util.Scanner;

public class Recieved  implements orderReceipt,Itemkind{
	 static double total=0.00;
	Scanner s=new Scanner(System.in);
	 public void vegrecipt()
	 {
		 System.out.println("Kindly select your menu");
		 
		 System.out.println("how many Item do you want to placed order");
		 int z=s.nextInt();
		 s.hasNextLine();
		 int []item=new int[z];

		 System.out.println("Kindly enter the item number");
		 for(int i=0;i<z;i++)
		 {
			 
			 item[i]=s.nextInt();
			 		s.nextLine();
		 }
		
//		 int a=s.nextInt();
//		 s.nextLine();
		 for(int i=0;i<z;i++) 
		 {
			 int a=0;
			 a=item[i];
		 
		 if(a==1)
		 {
			 total=total+Itemkind.Malai_Kofta;
			 
		 }
		 if(a==2)
		 {
			 total=total+Itemkind.PalakP_Paneer;
			 
		 }
		 if(a==3)
		 {
			 total=total+Itemkind.Rajma;
			 
		 }
		 if(a==4)
		 {
			 total=total+Itemkind.Mutter_Paneer; 
		 }
		 if(a==5)
		 {
			 total=total+Itemkind.Kaali_Daal;
		 }
		 if(a==6)
		 {
			 total=total+Itemkind.Chole;
		 }
		 if(a==7)
		 {
			 total=total+Itemkind.Aaloo_Paratha;
			 
		 }
		 if(a==8)
		 {
			 total=total+Itemkind.Hara_Bhara_Kabab;
		 }
		 if(a==9)
		 {
			 total=total+Itemkind.Daal_Palak;
		 }
		 if(a==10)
		 {
			 total=total+Itemkind.Ice_cream;
		 }
		 }
	 }
	 public void nonvegrecipt()
	 {
		 System.out.println("Kindly select your menu");
		 System.out.println("how many Item do you want to placed order");
		 int z=s.nextInt();
		 s.hasNextLine();
		 int []item=new int[z];

		 System.out.println("Kindly enter the item number");
		 for(int i=0;i<z;i++)
		 {
			 
			 item[i]=s.nextInt();
			 		s.nextLine();
		 }
		
		
		 for(int i=0;i<z;i++) 
		 {
			 int a=0;
			 a=item[i];
		 
		 if(a==1)
		 {
			 total=total+Itemkind.Grilled_Chicken;
			 
		 }
		 if(a==2)
		 {
			 total=total+Itemkind.Mutton_Korma;
			 
		 }
		 if(a==3)
		 {
			 total=total+Itemkind.Pina_Colada;
			 
		 }
		 if(a==4)
		 {
			 total=total+Itemkind.Lamb_Chops; 
		 }
		 if(a==5)
		 {
			 total=total+Itemkind.Malabar_Fish_Biryani;
		 }
		 if(a==6)
		 {
			 total=total+Itemkind.Pina_Colada_Pork_Ribs;
		 }
		 if(a==7)
		 {
			 total=total+Itemkind.Tandoori_Lamb_Chops;
			 
		 }
		 if(a==8)
		 {
			 total=total+Itemkind.Malabar_Fish_Curry;
		 }
		 if(a==9)
		 {
			 total=total+Itemkind.Keema_Samosa_with_Yoghurt_Dip;
		 }
		 if(a==10)
		 {
			 total=total+Itemkind.Curried_Parmesan_Fish_Fingers;
		 }
		 if(a==11)
		 {
			 total=total+Itemkind.Chicken_65;
		 }
		 if(a==12)
		 {
			 total=total+Itemkind.Butter_Chicken;
		 }
	 }
	 }  
	 
}
