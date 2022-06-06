import java.util.ArrayList;
import java.util.TreeMap;

import product.Products;

public class Cart {

	// Fields

	private TreeMap<Integer, Products> inventory = new TreeMap<Integer, Products>();
//	outer ArrayList is size 5 elements 0-4 (ID, Name, Quantity, Unit Price , Line total)
// I initially thought an ArrayList of an ArrayList Object would be what we needed to hold the individual product Arrays
//	private ArrayList<ArrayList<Object>> cart = new ArrayList<ArrayList<Object>>();
	private ArrayList<Integer> productId = new ArrayList<Integer>();
	private ArrayList<String> productName = new ArrayList<String>();
	private ArrayList<Integer> productQuantity = new ArrayList<Integer>();
	private ArrayList<Double> productUnitPrice = new ArrayList<Double>();
	private ArrayList<Double> productTotalPrice = new ArrayList<Double>();
	private double subTotal;
	private double totalTax;
	private double taxRate = 0.06;
	private double grandTotal;

	public TreeMap<Integer, Products> getInventory() {
		return inventory;
	}

	// may run into issues with shallow vs deep copy
	public void setInventory(TreeMap<Integer, Products> inventory) {
		this.inventory = inventory;
	}

//	public ArrayList<ArrayList<Object>> getCart() {
//		return cart;
//	}

	public ArrayList<Integer> getProductId() {
		return productId;
	}

	public void setId(ArrayList<Integer> id) {
		productId = id;
	}

	public ArrayList<String> getProductName() {
		return productName;
	}

	public void setProductName(ArrayList<String> productName) {
		this.productName = productName;
	}

	public ArrayList<Integer> getQuantity() {
		return productQuantity;
	}

	public void setQuantity(ArrayList<Integer> quantity) {
		productQuantity = quantity;
	}

	public ArrayList<Double> getUnitPrice() {
		return productUnitPrice;
	}

	public void setUnitPrice(ArrayList<Double> unitPrice) {
		productUnitPrice = unitPrice;
	}

	public ArrayList<Double> getTotalPrice() {
		return productTotalPrice;
	}

	public void setTotalPrice(ArrayList<Double> totalPrice) {
		productTotalPrice = totalPrice;
	}

	public double getSubtotal() {
		return subTotal;
	}

	public void setSubtotal(double subtotal) {
		this.subTotal = subtotal;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
		// Constructors default

		// Methods

	}

	public double getGrandTotal() {
		return grandTotal;
	}
	
//Constructor
	public Cart(TreeMap<Integer, Products> inStock) {
		// shallowCop
		inventory = inStock;
	}

	// add item only if it does not exist in the cart already.
	public void addItem(int id, int quantity) {
		if (productId.contains(id)) {
			int indexOfID = productId.indexOf(id);
			int newQuantity = productQuantity.get(indexOfID);
			newQuantity += quantity;
			if (newQuantity <= 0) {
				removeItem(id);
				System.out.println(
						"The amount you removed is more than whats in your cart so we removed the item entirely");
			} else {
				productQuantity.set(indexOfID, newQuantity);
			}
		} else {
			try {
				productId.add(id);
				int indexOfID = productId.indexOf(id);
				// may be an issue to use add(index,Element)
				productName.add(indexOfID, inventory.get(id).getName());
				productQuantity.add(indexOfID, quantity);
				productUnitPrice.add(indexOfID, inventory.get(id).getPrice());
				productTotalPrice.add(indexOfID, (quantity * inventory.get(id).getPrice()));
			} catch (Exception e) {
				System.out.println("The ID most likeley is not in the Invenntory");
			}
		}
		subTotal();
		calcTax();
		grandTotal();
	}

	// this method removes the line item by removing the ID's index from each
	// arraylist
	public void removeItem(int id) {
		try {
			int indexOfID = productId.indexOf(id);
			productId.remove(indexOfID);
			productName.remove(indexOfID);
			productQuantity.remove(indexOfID);
			productTotalPrice.remove(indexOfID);
			productUnitPrice.remove(indexOfID);
			subTotal();
			calcTax();
			grandTotal();

		} catch (Exception e) {
			System.out.println("Something is wrong in removeItem()");
		}
	}

	// removes item quantity. If the quantity entered exceeds the quantity available
	// in the cart, the item is removed completely
	public void reduceQuantity(int id, int quantity) {
		try {
			if (productId.contains(id)) {
				int indexOfID = productId.indexOf(id);
				int newQuantity = productQuantity.get(indexOfID);
				newQuantity -= quantity;
				if (newQuantity <= 0) {
					removeItem(indexOfID);
					System.out.println(
							"The amount you removed is more than whats in your cart so we removed the item entirely");
				} else {
					productQuantity.set(indexOfID, newQuantity);
				}
			}

		} catch (Exception e) {
			System.out.println(id + " Does not associate with a product in our inveontory");
		}
	}

	public double subTotal() {
		subTotal = 0;
		for (double price : productTotalPrice) {
			subTotal += price;
		}
		return subTotal;
	}

	public double calcTax() {
		totalTax = 0;
		totalTax = subTotal * taxRate;
		return totalTax;
	}

	public double grandTotal() {
		grandTotal = 0;
		grandTotal = calcTax() + subTotal;
		return grandTotal;
	}

	public void displayCart() {
//		you may be able to user an ArrayList of an ArrayList but get the code working first
//		cart.add(productId);
//		
//		List<Object[]> list = new ArrayList<Object[]>();
//		List<Object> cart = new ArrayList<Object>();
//		cart.add(productId);
//		cart.add(productName);
//		cart.add(productQuantity);
//		cart.add(productUnitPrice);
//		cart.add(productTotalPrice);

		String header = String.format("%-5s|%20s |%10s|%12s|%12s|", "ID", "Product Name", "Quantity", "Unit Price",
				"Total Price");
		System.out.println(header + "\r\n" + "-".repeat(header.length()));
		System.out.println("Cart Size:" + productId.size());
		for (int i = 0; i < productId.size(); i++) {
			String lineItem = String.format("%-5d|%20s |%10d|%12.2f|%12.2f|", productId.get(i), productName.get(i),
					productQuantity.get(i), productUnitPrice.get(i), productTotalPrice.get(i));
			System.out.println(lineItem);
		}

		// needs formating
//		DecimalFormat df = new DecimalFormat("#,###.##");
		subTotal();
		calcTax();
		grandTotal();

		System.out.printf("Sub Total" + "-".repeat(50) + "%.2f", subTotal);
		System.out.println();
		System.out.printf("Tax" + "-".repeat(50) + "%.2f", totalTax);
		System.out.println();
		System.out.printf("Grand Total" + "-".repeat(50) + "%.2f", grandTotal);
		
		

	}

	public void clearCart() {
        productId.removeAll(productId);
        productName.removeAll(productName);
        productQuantity.removeAll(productQuantity);
        productTotalPrice.removeAll(productTotalPrice);
        productUnitPrice.removeAll(productUnitPrice);
        subTotal = 0;
		totalTax = 0;
		grandTotal = 0;
    }
}
