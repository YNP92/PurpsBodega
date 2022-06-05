import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import product.Products;

public class UserInput {

	private static Scanner scnr = new Scanner(System.in);

	private static int userAction;
	private static int itemSelect;
	private static int quantity;
	private static double doubleInput;
	private static String stringInput;
	private static boolean booleanInput;

	public static String stringGet() {
		System.out.println("Please enter a text.");
		stringInput = scnr.nextLine();
		return stringInput;
	}

	public int getAction() {
		boolean validAction = false;
		System.out.println("Please enter the number of the Action you would like to take:");
		while (!validAction) {
			try {
				userAction = scnr.nextInt();
				if (userAction > 0 && userAction < 7) {
					validAction = true;
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				scnr.nextLine();
				System.out.println("Your input was not vlaid, try again:");
			}
		}
		return userAction;
	}
	
	public int getItem(TreeMap<Integer, Products> inventory) {
		boolean validAction = false;
		System.out.println("Please enter the ID of the item you wish to MODIFY: ");
		while (!validAction) {
			try {
				itemSelect = scnr.nextInt();
				if (itemSelect >= 0 && itemSelect < (inventory.size()-1)){
					validAction = true;
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				scnr.nextLine();
				System.out.println("Your input was invlaid, try again:");
			}
		}
		return itemSelect;
	}

	public int getItemToRemove(ArrayList<Integer> productId) {
		boolean validAction = false;
		System.out.println("Please enter the ID of the item you wish to REMOVE: ");
		while (!validAction) {
			try {
				itemSelect = scnr.nextInt();
				if (productId.contains(itemSelect)) {
					validAction = true;
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				scnr.nextLine();
				System.out.println("Your input was invlaid, try again:");
			}
		}
		return itemSelect;
	}
	
	
	
	
	
	
	
	public int getQuantity() {
		boolean validAction = false;
		System.out.println("Please enter the QUANTITY you would like to add to your cart(negative quantities are deducted form your current quantity): ");
		while (!validAction) {
			try {
				quantity = scnr.nextInt();
//				if (quantity > 0 ){
					validAction = true;
					break;
//				} else {
//					throw new Exception();
//				}
			} catch (Exception e) {
				scnr.nextLine();
				System.out.println("Your input was invlaid, try again:");
			}
		}
		return quantity;
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
