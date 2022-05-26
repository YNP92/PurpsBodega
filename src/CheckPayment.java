
public class CheckPayment extends Payment {

	private String checkNumber;

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public CheckPayment(double amount, String checkNumber) {
		super(amount);
		this.checkNumber = checkNumber;
	}

	public boolean validateCheckNumber(String checkNumber) {
		return checkNumber.matches("^[0-9]{4}$");
	}
}
