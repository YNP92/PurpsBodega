import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		
	}
	private Scanner scnr = new Scanner(System.in);

	private int integerInput;
	private double doubleInput;
	private String stringInput;
	private boolean booleanInput;

	public String stringGet() {
		System.out.println("Please enter a text.");
		stringInput = scnr.nextLine(); 
		return stringInput;
	}
	
	public int integerGet() {
		System.out.println("Please enter a number.");
		integerInput = scnr.nextInt();
		return integerInput;
	}
	public double doubleGet() {
		System.out.println("Please enter a decimal number");
		doubleInput = scnr.nextDouble();
		return doubleInput;
	}
	public boolean booleanGet() {
		System.out.println("Please enter y or n");
		booleanInput = scnr.nextBoolean();
		return booleanInput;
	}
}
