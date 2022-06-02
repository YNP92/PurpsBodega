public class ShoppingCart {
	
	private Inventory catalog;
	private int[] orderQuantities;
	private Payment orderPayment; 
	private double subtotal;
	private double totalTax;
	
	

	public ShoppingCart(Inventory catalog) {
		setInventory(catalog);
		orderQuantities = new int[catalog.getInventory().size()];
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
		
		System.out.printf("%-36s", "      Total: ");
		System.out.printf("$%6.2f\n", subtotal + totalTax);
	}
	
	public Inventory getInventory() {
		return catalog;
	}
	
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