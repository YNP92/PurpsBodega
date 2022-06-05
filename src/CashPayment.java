public class CashPayment extends Payment {

	static double initialChange;
	static double change;
//	static int twentyCount;
//	static int tenCount;
//	static int fiveCount;
//	static int dollarCount;
//	static int quarterCount;
//	static int dimeCount;
//	static int nickelCount;
//	static int pennyCount;

	public CashPayment(double amount) {
		super(amount);
	}

	public static double pay() {
		System.out.println("Enter amount of money to give cashier.");
		double tender = UserInput.doubleGet();
		return tender;
	}

	public static double getChange(double tender, double amount) {
		if (tender < amount) {
			System.out.println("That isn't enough money");
		} else if(tender > amount) {
		change = tender - amount;
		} return change;
	}

//	public static String returnChange(double change) {
//
//		while (change >= 1) {
//			if (change >= 20) {
//				change = change - 20;
//				twentyCount++;
//				continue;
//			}
//			if (change >= 10) {
//				change = change - 10;
//				tenCount++;
//				continue;
//			}
//			if (change >= 5) {
//				change = change - 5;
//				fiveCount++;
//				continue;
//			}
//			if (change >= 1) {
//				change = change - 1;
//				dollarCount++;
//				continue;
//			}
//		}
//		while (change != 0) {
//			if (change >= .25) {
//				change = change - .25;
//				quarterCount++;
//				continue;
//			}
//			if (change >= .1) {
//				change = change - .1;
//				dimeCount++;
//				continue;
//			}
//			if (change >= .05) {
//				change = change - .05;
//				nickelCount++;
//				continue;
//			}
//			if (change >= .01) {
//				change = change - .01;
//				pennyCount++;
//				continue;
//			}
//		}
//		return "Your change is " + twentyCount + " 20's, " + tenCount + " 10's, " + fiveCount + " 5's, " + dollarCount
//				+ " 1's, " + quarterCount + " quarters, " + dimeCount + " dimes, " + nickelCount + " nickels, and "
//				+ pennyCount + " pennies.";
	}

