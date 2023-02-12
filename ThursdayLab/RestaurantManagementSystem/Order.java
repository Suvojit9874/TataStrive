package RestaurantManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;
     
public class Order {
	static Scanner sc =new Scanner(System.in);
	static void DisplayMenu() {
		ArrayList<Menu>  m =new ArrayList<>();
		m.add(new Menu("1.Biryani Combo", 200));
		m.add(new Menu("2.Chinese Combo", 350));
		m.add(new Menu("3.Bada Platter", 150));
		m.add(new Menu("4.Kebab Platter", 200));
		m.add(new Menu("5.Steam momo", 100));
		m.add(new Menu("6.panfriend momo", 120));
		for(Menu item:m) {
			System.out.println(item.getItemName()+"            Rs."+item.getItemPrice());
		}
	  }
		

	public static void main(String[] args) {
	System.out.println("******************Welcome To Restaurant Management System*****************");
	 ArrayList<bill> bills =new ArrayList<>();
	int total=0;
	do{
		System.out.println("Do you want to order (y/n)");
		char ch=sc.next().charAt(0);
		switch(ch) {
		            
		    case 'y':  DisplayMenu();
		    
		    System.out.println("Enter the food ID");
			int foodItem=sc.nextInt();
			int price=0;
			switch(foodItem) {
			case 1: System.out.println("Chicken Biryani");
			        price=200;
			        System.out.println("Enter the quantity");
			        int quantity =sc.nextInt();
			        bills.add(new bill("Chicken Biryani", quantity, price*quantity));
			        break;
			case 2: System.out.println("Chinese Combo");
			          price=350;
			         System.out.println("Enter the quantity");
		             quantity =sc.nextInt();
		              bills.add(new bill("Chinese Combo", quantity, price*quantity));
	                   break;
			case 3: System.out.println("Bada Platter");
			        price=150;
			        System.out.println("Enter the quantity");
                    quantity =sc.nextInt();
                    bills.add(new bill("Bada Platter", quantity, price*quantity));
	                break;
			case 4: System.out.println("Kebab Platter");
			        price=200;
			        System.out.println("Enter the quantity");
                     quantity =sc.nextInt();
                    bills.add(new bill("Kebab Platter", quantity, price*quantity));
	                 break;
			case 5: System.out.println("Steam momo");
			        price=100;
			        System.out.println("Enter the quantity");
                    quantity =sc.nextInt();
                     bills.add(new bill("Steam momo", quantity, price*quantity));
	               break;
			case 6: System.out.println("panfriend momo");
			       price=120;
			       System.out.println("Enter the quantity");
                   quantity =sc.nextInt();
                   bills.add(new bill("panfriend momo", quantity, price*quantity));
	               break;
	        default: System.out.println("Enter correct ID");
	        
			}
		              break;
		    case 'n': for(bill item:bills) {
		    	      System.out.println(item.itemName +"      "+item.Quantity+"   "+item.getPrice());
		    	      total=total+item.getPrice();
		                 }
		    	      System.out.println("Total: "+total);
		    	      System.exit(0);
		    
		}
	}while(true);
	}
}
