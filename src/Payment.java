
public class Payment {

	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Payment(double amount) {
		this.amount = Math.round(amount*100)/100.0;
	}
	
}
