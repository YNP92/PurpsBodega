public class CheckPayment extends Payment {

	private static String checkNumber;
	private static boolean checkAccepted = false;

	public static void pay() {
		do {
		System.out.println("Please enter your 4 digit check number");
		checkNumber = UserInput.stringGet();
		if (validateCheckNumber(checkNumber) == true) {
			System.out.println("Check accepted, thank you and have a wonderful day!");
			checkAccepted = true;
		} else {
			System.out.println("Please enter a valid 4 digit check number.");
		}
		} while(!checkAccepted);
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		CheckPayment.checkNumber = checkNumber;
	}

	public CheckPayment(double amount, String checkNumber) {
		super(amount);
		CheckPayment.checkNumber = checkNumber;
	}

	public static boolean validateCheckNumber(String checkNumber) {
		return checkNumber.matches("^[0-9]{4}$");
	}

}
