import java.util.Scanner;

public class UserInput {
	private static Scanner scnr = new Scanner(System.in);

	private static int integerInput;
	private static double doubleInput;
	private static String stringInput;
	private static boolean booleanInput;

	public static String stringGet() {
		stringInput = scnr.nextLine();
		return stringInput;
	}

	public int integerGet() {
		System.out.println("Please enter a number.");
		integerInput = scnr.nextInt();
		scnr.nextLine();
		return integerInput;
	}

	public static double doubleGet() {
		System.out.println("Please enter a decimal number");
		doubleInput = scnr.nextDouble();
		scnr.nextLine();
		return doubleInput;
	}

	public boolean booleanGet() {
		System.out.println("Please enter y or n");
		booleanInput = scnr.nextBoolean();
		scnr.nextLine();
		return booleanInput;
	}
}
