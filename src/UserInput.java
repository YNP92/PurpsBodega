import java.util.Scanner;

public class UserInput {
<<<<<<< HEAD
	public static void main(String[] args) {

	}

	private Scanner scnr = new Scanner(System.in);
=======
	private static Scanner scnr = new Scanner(System.in);
>>>>>>> 0f0b13e4f898ea598dcdf93b2cf368a4e68d6f71

	private static int integerInput;
	private static double doubleInput;
	private static String stringInput;
	private static boolean booleanInput;

<<<<<<< HEAD
	public String stringGet() {
		System.out.println("Please enter a text.");
=======
	public static String stringGet() {
>>>>>>> 0f0b13e4f898ea598dcdf93b2cf368a4e68d6f71
		stringInput = scnr.nextLine();
		return stringInput;
	}

	public int integerGet() {
<<<<<<< HEAD

		do {
			System.out.println("Please enter a number between 1-15.");
			while (!scnr.hasNextInt()) {
				System.out.println("Incorrect. Try again. ");
				scnr.next();
			}
			integerInput = scnr.nextInt();
		} while (integerInput <= 0 && integerInput >= 15);
		return integerInput;
	}

	public double doubleGet() {

		do {
			System.out.println("Please enter a decimal number");
			while (!scnr.hasNextDouble()) {
				System.out.println("Incorrect. Try again. ");
				scnr.next();
			}
			doubleInput = scnr.nextDouble();
		} while (doubleInput <= 0);
=======
		System.out.println("Please enter a number.");
		integerInput = scnr.nextInt();
		scnr.nextLine();
		return integerInput;
	}

	public static double doubleGet() {
		System.out.println("Please enter a decimal number");
		doubleInput = scnr.nextDouble();
		scnr.nextLine();
>>>>>>> 0f0b13e4f898ea598dcdf93b2cf368a4e68d6f71
		return doubleInput;
	}

	public boolean booleanGet() {
		System.out.println("Please enter y or n");
		booleanInput = scnr.nextBoolean();
		scnr.nextLine();
		return booleanInput;
	}
}
