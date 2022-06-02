import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {

	}

	private static Scanner scnr = new Scanner(System.in);

	private static int integerInput;
	private static double doubleInput;
	private static String stringInput;
	private static boolean booleanInput;

	public static String stringGet() {
		System.out.println("Please enter a text.");
		stringInput = scnr.nextLine();
		return stringInput;
	}

	public static int integerGet() {

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

	public static double doubleGet() {

		do {
			System.out.println("Please enter a decimal number");
			while (!scnr.hasNextDouble()) {
				System.out.println("Incorrect. Try again. ");
				scnr.next();
			}
			doubleInput = scnr.nextDouble();
		} while (doubleInput <= 0);
		return doubleInput;
	}

	public static boolean booleanGet() {
		System.out.println("Please enter y or n");
		booleanInput = scnr.nextBoolean();
		return booleanInput;
	}
}
