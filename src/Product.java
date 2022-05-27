import java.util.ArrayList;

public class Product {

	private String name;
	private String category;
	private String description;
	double price;

	public Product(String name, String category, String description, double price) {
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;

		ArrayList<Product> list = new ArrayList<Product>();
		Product p1 = new Product("Roast Beef", "Deli Meats", "1/2lb, sliced", 5.99);
		Product p2 = new Product("Turkey", "Deli Meats", "1lb, sliced", 7.50);
		Product p3 = new Product("Salami", "Deli Meats", "1lb, whole or sliced", 8.99);
		Product p4 = new Product("Pepperoni", "Deli Meats", "1lb, whole or sliced", 8.50);
		Product p5 = new Product("Bacon, Egg, and Cheese", "Hot Food", "1 whole sandwich", 3.99);
		Product p6 = new Product("Hot Pastrami", "Hot Food", "1 whole sandwich, mustard on side", 4.99);
		Product p7 = new Product("Hamburger", "Hot Foods", "1 whole sandwich, lettuce, tomato, onion, pickle, ketchup, and mustard", 3.99);
		Product p8 = new Product("Chicken Wings", "Hot Foods", "6 pcs, hot sauce on side", 5.99);
		Product p9 = new Product("Coke", "Drinks", "12oz bottle", 1.29);
		Product p10 = new Product("Sprite", "Drinks", "12oz bottle", 1.29);
		Product p11 = new Product("Water", "Drinks", "12oz bottle", 1.00);
		Product p12 = new Product("Hot Coffee", "Drinks", "12oz cup, cream and sugar available", 1.49);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		list.add(p6);
		list.add(p7);
		list.add(p8);
		list.add(p9);
		list.add(p10);
		list.add(p11);
		list.add(p12);
	}
}