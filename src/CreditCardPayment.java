
public class CreditCardPayment extends Payment {

	private String creditCardNumber, expirationDate, cVV;
	int validationCount = 0;

	public void pay() {
		System.out.println("Please enter your credit card number: ");
		creditCardNumber = UserInput.stringGet();
		if (validateCreditCardNumber(creditCardNumber) == true) {
			validationCount++;
		}
		System.out.println("Please enter your expiration date (mm/dd): ");
		expirationDate = UserInput.stringGet();
		if (validateExpirationDate(expirationDate) == true) {
			validationCount++;
		}
		System.out.println("Please enter the 3 or 4 digit CVV on the back of your card: ");
		cVV = UserInput.stringGet();
		if (validateCVV(cVV) == true) {
			validationCount++;
		}
		if (validationCount == 3) {
			System.out.println("Card accepted, thank you for your business!");
		}
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getcVV() {
		return cVV;
	}

	public void setcVV(String cVV) {
		this.cVV = cVV;
	}

	public CreditCardPayment(double amount, String creditCardNumber, String expirationDate, String cVV) {
		super(amount);
		this.creditCardNumber = creditCardNumber;
		this.expirationDate = expirationDate;
		this.cVV = cVV;
	}

	public boolean validateCreditCardNumber(String creditCardNumber) {
		return creditCardNumber.matches("^[0-9]{16}$");
	}

	public boolean validateExpirationDate(String expirationDate) {
		return expirationDate.matches("(?:0[1-9]|1[0-2])/[0-9]{2}");
	}

	public boolean validateCVV(String cVV) {
		return cVV.matches("^[0-9]{3, 4}$");
	}

}
