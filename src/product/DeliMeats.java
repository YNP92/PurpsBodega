package product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DeliMeats extends Products {
	// Default DATE entry is MMDDYYYY
	private LocalDate expireDate;

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	// Constructors
//	public DeliMeats(String name, String category, String description, double price, int expireDate) {
//		setName(name);
//		setCategory(category);
//		setDescription(description);
//		setPrice(price);
//		setExpireDate(expireDate);
//
//	}
	//implement LocalDate for expirationdate if you have enough time
	public DeliMeats(String name, String category, String description, double price, LocalDate expireDate) {
		setName(name);
		setCategory(category);
		setDescription(description);
		setPrice(price);
		setExpireDate(expireDate);

	}

	@Override
	public void specificProductDetails() {
		// TODO Auto-generated method stub
		generalProductDetails();
		System.out.println("Expiration Date: " + expireDate);

	}
	
	public static LocalDate setExpireDate(int days) {
		//user the date/time api to get the current date and add 7 days to it. which will represent the expire date

		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		
		date = date.plusDays(days);
////		String hardDate = date.format(formatter);
////		System.out.println("hardDate: "+ hardDate);
////		System.out.println(date.format(formatter));
		return date;
		
	}
}
