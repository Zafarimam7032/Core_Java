package com.ord.pojo;

public class ItemMenu extends Itemtype implements Itemkind {

	@Override
	public void vegItem() {
		// TODO Auto-generated method stubS
		System.out.println("================veg=============");
		System.out.println("1.	"+Malai_Kofta+"		Malai Kofta");
		System.out.println("2.	"+PalakP_Paneer+"		Palak Paneer");
		System.out.println("3.	"+Rajma+"		Rajma (Red Kidney Bean Curry)");
		System.out.println("4.	"+Mutter_Paneer+"		Mutter Paneer ");
		System.out.println("5.	"+Kaali_Daal+"		Kaali Daal");
		System.out.println("6.	"+Chole+"		Chole (Chickpea Curry)");
		System.out.println("7.	"+Aaloo_Paratha+"		Aaloo Paratha (Potato Paratha)");
		System.out.println("8.	"+Hara_Bhara_Kabab+"		Hara Bhara Kabab (Vegetarian Kabab)");
		System.out.println("9.	"+Daal_Palak+"		Daal-Palak Ka Shorba Soup (Lentil and Spinach)");
		System.out.println("10. 	"+Ice_cream+"		Ice Cream");
		
	}

	@Override
	public void nonVegItem() {
		// TODO Auto-generated method stub
		System.out.println("================non veg=============");
		System.out.println("1. 	"+Grilled_Chicken+"		Grilled Chicken");
		System.out.println("2. 	"+Mutton_Korma+"		Mutton Korma");
		System.out.println("3. 	"+Pina_Colada+"		Pina Colada");
		System.out.println("4. 	"+Lamb_Chops+"		Lamb Chops.");
		System.out.println("5. 	"+Malabar_Fish_Biryani+"		Malabar Fish Biryani.");
		System.out.println("6. 	"+Pina_Colada_Pork_Ribs+"		Pina Colada Pork Ribs");
		System.out.println("7. 	"+Tandoori_Lamb_Chops+"		Tandoori Lamb Chops");
		System.out.println("8. 	"+Malabar_Fish_Curry+"		Malabar Fish Curry");
		System.out.println("9. 	"+Keema_Samosa_with_Yoghurt_Dip+"		Keema Samosa with Yoghurt Dip");
		System.out.println("10. 	"+Curried_Parmesan_Fish_Fingers+"		Curried Parmesan Fish Fingers");
		System.out.println("11.	"+Chicken_65+"		Chicken 65");
		System.out.println("12. 	"+Butter_Chicken+"		Butter Chicken");
		
	}
	public static void main(String[] args) {
		ItemMenu obj=new ItemMenu();
		obj.vegItem();
		obj.nonVegItem();
	}

}
