package product;
// Product can be an abstract class. All products require these elements. We need to add at least one abstract method to this class for the subclasses to implement. 
public abstract class Product {

	private String name;
	private String category;
	private String description;
	private double price;
	
//Work on creating a SKU later this is a plus one. SKU can be generated using the first two letters of the category and then
	//adding an incremented number
//	private String sku;
//	Set<String> skuList = new TreeSet<String>();
	
	public String getName() {
	return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void generalProductDetails() {
		System.out.println(
				"Name: " + this.name + System.lineSeparator()+
				"Category: " + this.category+ System.lineSeparator()+
				"Description: " +this.description+ System.lineSeparator()+
				"Price: " + this .price + System.lineSeparator());
	}
	public abstract void specificProductDetails();
	
	
//	public Product(String name, String category, String description, double price) {
//		this.name = name;
//		this.description = description;
//		this.category = category;
//		this.price = price;
//
//		ArrayList<Product> list = new ArrayList<Product>();
//		Product p1 = new Product("Roast Beef", "Deli Meats", "1/2lb, sliced", 5.99);
//		Product p2 = new Product("Turkey", "Deli Meats", "1lb, sliced", 7.50);
//		Product p3 = new Product("Salami", "Deli Meats", "1lb, whole or sliced", 8.99);
//		Product p4 = new Product("Pepperoni", "Deli Meats", "1lb, whole or sliced", 8.50);
//		Product p5 = new Product("Bacon, Egg, and Cheese", "Hot Food", "1 whole sandwich", 3.99);
//		Product p6 = new Product("Hot Pastrami", "Hot Food", "1 whole sandwich, mustard on side", 4.99);
//		Product p7 = new Product("Hamburger", "Hot Foods", "1 whole sandwich, lettuce, tomato, onion, pickle, ketchup, and mustard", 3.99);
//		Product p8 = new Product("Chicken Wings", "Hot Foods", "6 pcs, hot sauce on side", 5.99);
//		Product p9 = new Product("Coke", "Drinks", "12oz bottle", 1.29);
//		Product p10 = new Product("Sprite", "Drinks", "12oz bottle", 1.29);
//		Product p11 = new Product("Water", "Drinks", "12oz bottle", 1.00);
//		Product p12 = new Product("Hot Coffee", "Drinks", "12oz cup, cream and sugar available", 1.49);
//
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		list.add(p4);
//		list.add(p5);
//		list.add(p6);
//		list.add(p7);
//		list.add(p8);
//		list.add(p9);
//		list.add(p10);
//		list.add(p11);
//		list.add(p12);
	}
