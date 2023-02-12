package RestaurantManagementSystem;

public class Menu {
		String ItemName;
		int ItemPrice;
	
		public Menu(String itemName, int itemPrice) {
			super();
			ItemName = itemName;
			ItemPrice = itemPrice;
			
		}
		public String getItemName() {
			return ItemName;
		}
		public int getItemPrice() {
			return ItemPrice;
		}
	
		
}
