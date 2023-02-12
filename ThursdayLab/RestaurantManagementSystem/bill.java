package RestaurantManagementSystem;

import java.util.ArrayList;

public class bill {
	String itemName;
	int Quantity;
	int price;
		ArrayList<bill> bills =new ArrayList<>();
		public bill(String itemName, int quantity, int price) {
			super();
			this.itemName = itemName;
			this.Quantity = quantity;
			this.price = price;
			
		}
		public String getItemName() {
			return itemName;
		}
		public int getQuantity() {
			return Quantity;
		}
		public int getPrice() {
			return price;
		}
		
}
