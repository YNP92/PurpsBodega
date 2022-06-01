import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import product.DeliMeats;
import product.Drinks;
import product.HotDogs;
import product.Inventory;

public class PurpsBodegaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// viewMenu provides the customer with all options available in purps bodega.
//		viewMenu();
//		LocalDate date = LocalDate.now();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
//		date = date.plusDays(7);
//		String hardDate = date.format(formatter);
//		System.out.println("hardDate: "+ hardDate);
//		System.out.println(date.format(formatter));
		String header = String.format("|%-10s|%-10s|%10s|", "ID","Product Name","Price");
		System.out.println(header);
		
	}

	public void addDrinks() {
		Drinks bendersCafe = new Drinks("Benders Cafe","Coffee", "Smooth, slightly acidic, blend from the coffee domes of Mars", 1.00, 0, 0);
		Drinks glacierWater = new Drinks("Glacier Water","Water","It's melting, so why not bottle it!", 9.75 );
		Drinks duffBeer = new Drinks("Duff Beer", "Beer", "IYKYK", 5.50, true);
		Drinks vantaVino = new Drinks("VantaVino", "Wine", "Because its better out of a Box", 11.29, true);
	}

	public void addHotDogs() {
		HotDogs chicagoStyle = new HotDogs("The Chi Dog", "Hot Dog", "Out her we like out dogs with Cheese and Mustard Only! ", 3.50, true, false, true, false);
		HotDogs detroitStyle = new HotDogs("D-Dog","Hot Dog" , "Did you say ALL THE Chilli!", 3.10, false, false, false, true);
		HotDogs nycStyle = new HotDogs("Empire Dog","Hot Dog" , "My guy, you get what I give ya, and I gave ya ketchup and mustard,are we understood?", 4.00, false, true, true, false);
		HotDogs nawlinsStyle = new HotDogs("Le Chien","Hot Dog" , "This dog is HEAVY.", 4.00, true, true, true, true);
	}


	public void addDeliMeats() {
		
		//expire date in in MMDDYYYY we can format it later
		DeliMeats austinFarm = new DeliMeats("Honey Ham", "Ham", "Fresh from Austin's Farms",  3, DeliMeats.setExpireDate(7) );
		DeliMeats tristanFarm = new DeliMeats("Apple Smoked Turkey","Turkey", "Fresh from Tristan's Farms", 2, DeliMeats.setExpireDate(10));
		DeliMeats niFarm = new DeliMeats("Brown Suga Ham", "Ham", "Fresh from Ni's Farms", 4, DeliMeats.setExpireDate(7));
		DeliMeats yakshFarm = new DeliMeats("Peper Turkey", "Turkey", "Fresh from Yaksh's Farms", 2, DeliMeats.setExpireDate(10));

	}
	
}
