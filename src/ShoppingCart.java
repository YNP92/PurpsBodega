import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ShoppingCart {

	public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

	private static List<Product> catalog;
	private static Map<Product, ShoppingCart> cartMap = new HashMap<Product, ShoppingCart>();

	public static List<Product> getCatalog(String str) {
		if (catalog == null) {
			catalog = new Vector<Product>();
			catalog.add(new Product("Roast Beef", "Deli Meats", "1/2lb, sliced", 5.99));
			catalog.add(new Product("Turkey", "Deli Meats", "1lb, sliced", 7.50));
			catalog.add(new Product("Salami", "Deli Meats", "1lb, whole or sliced", 8.99));
			catalog.add(new Product("Pepperoni", "Deli Meats", "1lb, whole or sliced", 8.50));
			catalog.add(new Product("Bacon, Egg, and Cheese", "Hot Food", "1 whole sandwich", 3.99));
			catalog.add(new Product("Hot Pastrami", "Hot Food", "1 whole sandwich, mustard on side", 4.99));
			catalog.add(new Product("Hamburger", "Hot Foods",
					"1 whole sandwich, lettuce, tomato, onion, pickle, ketchup, and mustard", 3.99));
			catalog.add(new Product("Chicken Wings", "Hot Foods", "6 pcs, hot sauce on side", 5.99));
			catalog.add(new Product("Coke", "Drinks", "12oz bottle", 1.29));
			catalog.add(new Product("Sprite", "Drinks", "12oz bottle", 1.29));
			catalog.add(new Product("Water", "Drinks", "12oz bottle", 1.00));
			catalog.add(new Product("Hot Coffee", "Drinks", "12oz cup, cream and sugar available", 1.49));
		}

		return catalog;
	}

	public static void setQuantity(Product product, int quantity) {
		ShoppingCart entry = cartMap.get(product);

		if (quantity <= 0) {
			if (entry != null)
				removeProduct(product);
			return;
		}

		if (entry == null) {
			entry = new Inventory(product, quantity);
			cartMap.put(product, entry);
			return;
		}

		ShoppingCart.setQuantity(product, quantity);
	}

	public static int getProductQuantity(Product product) {
		Inventory entry = (Inventory) cartMap.get(product);

		if (entry != null)
			return entry.getQuantity();

		return 0;
	}

	public static void removeProduct(Product product) {
		cartMap.remove(product);
	}

	public static List<Product> getCartList() {
		List<Product> cartList = new Vector<Product>(cartMap.keySet().size());
		for (Product p : cartMap.keySet()) {
			cartList.add(p);
		}

		return cartList;
	}

}