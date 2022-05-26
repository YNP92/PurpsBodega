
public class CashPayment extends Payment{

	
	public CashPayment(double amount) {
		super(amount);
	}

	public static double getChange(double tender, double amount) {
		if(amount < tender) {
			System.out.println("That isn't enough money");
		}
			return tender - amount;
	}
}
