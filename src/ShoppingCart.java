import java.util.TreeMap;
import product.Inventory;
import product.Products;
public class ShoppingCart {

	
	private Inventory catalog;
	private int[] orderQuantities;
	private Payment orderPayment;
	private double subtotal;
	private double totalTax;

	public ShoppingCart(Inventory catalog) {
		setInventory(catalog);
		TreeMap<Integer, Products>productMap = catalog.getInventory();
		System.out.println(productMap.size());
		orderQuantities = new int[productMap.size()];
	}

	public void addProduct(int ID, int quantity) {
		orderQuantities[ID - 1] += quantity;
	}

	public void displaySummary() {
		for (int i = 0; i < catalog.getInventory().size(); i++) {
			if (orderQuantities[i] != 0) {

				subtotal += (orderQuantities[i] * catalog.getInventory().get(i).getPrice());
				if (catalog.getInventory().get(i).getPrice()) {
					totalTax += catalog.TAX_RATE * orderQuantities[i] * catalog.getInventory().get(i).getPrice();
				}
			}
		}

	}

	public TreeMap<Integer, Products> getInventory() {
		return catalog;
	}

	//Getters Setters
	public void setInventory(Inventory catalog) {
		this.catalog = catalog;
	}

	public int[] getOrderQuantities() {
		return orderQuantities;
	}

	public void setOrderQuantities(int[] orderQuantities) {
		this.orderQuantities = orderQuantities;
	}

	public Payment getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(Payment orderPayment) {
		this.orderPayment = orderPayment;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

}