import product.DeliMeats;
import product.Drinks;
import product.HotDogs;
import product.Inventory;

public class PurpsBodegaMain {
	private static Inventory inStock = new Inventory();
	private static Cart myCart = new Cart(inStock.getInventory());
	private static UserInput getInput = new UserInput();
	private static boolean awdy = false;
	
	public static void main(String[] args) {

		// Stock our inventory with Products
		addDrinks();
		addHotDogs();
		addDeliMeats();
	
		while (!awdy) {
			userMenu();
			System.out.println("");
			userAction(getInput.getAction());
			System.out.println("");
		}

	}

	public static void userAction(int action) {
//		switch statement?
		if (action == 1) {
			System.out.println("Display Inventory");
			inStock.displayInventoryAll();
		}
		else if(action == 2) {
			myCart.addItem(getInput.getItem(inStock.getInventory()), getInput.getQuantity());
		}
		else if (action == 3) {
			myCart.removeItem(getInput.getItemToRemove(myCart.getProductId()));
		}
		else if (action == 4) {
			myCart.displayCart();
		}
		else if (action == 5) {
			String paymentMethod = UserInput.getPaymentMethod();
			switch(paymentMethod) {
			case ("cash"):
				double tender = CashPayment.pay();
				double change = CashPayment.getChange(tender, myCart.getGrandTotal());
				System.out.println("\n RECEIPT\n");
				myCart.displayCart();
				System.out.printf("\nTender" + "-".repeat(50) + "%.2f", tender);
				System.out.printf("\nChange" + "-".repeat(50) + "%.2f", change);
				System.out.printf("\nBalance" + "-".repeat(50) + "0.00");
				break;
			case ("card"):
				CreditCardPayment.pay();
				System.out.println("\n RECEIPT\n");
				myCart.displayCart();
				System.out.printf("\nTender" + "-".repeat(50) + "%.2f", myCart.getGrandTotal());
				System.out.printf("\nChange" + "-".repeat(50) + "0.00");
				System.out.printf("\nBalance" + "-".repeat(50) + "0.00");
				break;
			case("check"):
				CheckPayment.pay();
				System.out.println("\n RECEIPT\n");
				myCart.displayCart();
				System.out.printf("\nTender" + "-".repeat(50) + "%.2f", myCart.getGrandTotal());
				System.out.printf("\nChange" + "-".repeat(50) + "0.00");
				System.out.printf("\nBalance" + "-".repeat(50) + "0.00");
				break;
			}
			myCart.clearCart();
			System.out.println("\nYou can either start a new order, or press 6 to exit the program.");
			
		}
		else if (action == 6) {
			System.out.println("Thank you for shopping at PurpsBodega, goodbye");
			awdy = true;
		}
		
	}

	public static void userMenu() {
		System.out.println("How may I help you");
		System.out.println("1. Show me your Inventory");
		System.out.println("2. Add to Cart");
		System.out.println("3. Remove from Cart");
		System.out.println("4. View my Cart");
		System.out.println("5. Checkout");
		System.out.println("6. Exit Store");
	}

	public static void addDrinks() {

		Drinks bendersCafe = new Drinks("Benders Cafe", "Coffee",
				"Smooth, slightly acidic, blend from the coffee domes of Mars", 1.00, 0, 0);
		Drinks glacierWater = new Drinks("Glacier Water", "Water", "It's melting, so why not bottle it!", 9.75);
		Drinks duffBeer = new Drinks("Duff Beer", "Beer", "IYKYK", 5.50, true);
		Drinks vantaVino = new Drinks("VantaVino", "Wine", "Because its better out of a Box", 11.29, true);
		inStock.setInventory(bendersCafe);
		inStock.setInventory(glacierWater);
		inStock.setInventory(duffBeer);
		inStock.setInventory(vantaVino);

	}

	public static void addHotDogs() {
		HotDogs chicagoStyle = new HotDogs("The Chi Dog", "Hot Dog",
				"Out her we like out dogs with Cheese and Mustard Only! ", 3.50, true, false, true, false);
		HotDogs detroitStyle = new HotDogs("D-Dog", "Hot Dog", "Did you say ALL THE Chilli!", 3.10, false, false, false,
				true);
		HotDogs nycStyle = new HotDogs("Empire Dog", "Hot Dog",
				"My guy, you get what I give ya, and I gave ya ketchup and mustard,are we understood?", 4.00, false,
				true, true, false);
		HotDogs nawlinsStyle = new HotDogs("Le Chien", "Hot Dog", "This dog is HEAVY.", 4.00, true, true, true, true);
		inStock.setInventory(chicagoStyle);
		inStock.setInventory(detroitStyle);
		inStock.setInventory(nawlinsStyle);
		inStock.setInventory(nycStyle);
	}

	public static void addDeliMeats() {

		// expire date in in MMDDYYYY we can format it later
		DeliMeats austinFarm = new DeliMeats("Honey Ham", "Ham", "Fresh from Austin's Farms", 3,
				DeliMeats.setExpireDate(7));
		DeliMeats tristanFarm = new DeliMeats("Apple Smoked Turkey", "Turkey", "Fresh from Tristan's Farms", 2,
				DeliMeats.setExpireDate(10));
		DeliMeats niFarm = new DeliMeats("Brown Suga Ham", "Ham", "Fresh from Ni's Farms", 4,
				DeliMeats.setExpireDate(7));
		DeliMeats yakshFarm = new DeliMeats("Peper Turkey", "Turkey", "Fresh from Yaksh's Farms", 2,
				DeliMeats.setExpireDate(10));
		inStock.setInventory(austinFarm);
		inStock.setInventory(tristanFarm);
		inStock.setInventory(niFarm);
		inStock.setInventory(yakshFarm);
	}

}
