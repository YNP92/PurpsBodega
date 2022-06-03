public class CheckPayment extends Payment {

	private String checkNumber;

	public void pay() {
		System.out.println("Please enter your 4 digit check number");
		checkNumber = UserInput.stringGet();
		if (validateCheckNumber(checkNumber) == true) {
			System.out.println("Check accepted, thank you and have a wonderful day!");
		}
	}

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
