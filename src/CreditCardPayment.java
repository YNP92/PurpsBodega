
public class CreditCardPayment extends Payment {

	private static String creditCardNumber, expirationDate, cVV;
	static int validationCount = 0;

	public static void pay() {
		do {
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
		System.out.println("Please enter the 3 digit CVV on the back of your card: ");
		cVV = UserInput.stringGet();
		if (validateCVV(cVV) == true) {
			validationCount++;
		}
		if (validationCount == 3) {
			System.out.println("Card accepted, thank you for your business!");
		} else if (validationCount != 3) {
			System.out.println("Something went wrong, try entering a valid card information.");
		}
		} while(validationCount != 3);
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		CreditCardPayment.creditCardNumber = creditCardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		CreditCardPayment.expirationDate = expirationDate;
	}

	public String getcVV() {
		return cVV;
	}

	public void setcVV(String cVV) {
		CreditCardPayment.cVV = cVV;
	}

	public CreditCardPayment(double amount, String creditCardNumber, String expirationDate, String cVV) {
		super(amount);
		CreditCardPayment.creditCardNumber = creditCardNumber;
		CreditCardPayment.expirationDate = expirationDate;
		CreditCardPayment.cVV = cVV;
	}

	public static boolean validateCreditCardNumber(String creditCardNumber) {
		return creditCardNumber.matches("^[0-9]{16}$");
	}

	public static boolean validateExpirationDate(String expirationDate) {
		return expirationDate.matches("(?:0[1-9]|1[0-2])/[0-9]{2}");
	}

	public static boolean validateCVV(String cVV) {
		return cVV.matches("^[0-9]{3}$");
	}

}
