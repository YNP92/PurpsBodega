package product;

public class DeliMeats extends Product{
	//Default DATE entry is MMDDYYYY
	private int expireDate;
	
	public int getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(int expireDate) {
		this.expireDate = expireDate;
	}

	//Constructors
	public DeliMeats(String name, String category, String description, double price, int expireDate) {
		
	}
	
	@Override
	public void specificProductDetails() {
		// TODO Auto-generated method stub
		generalProductDetails();
		System.out.println("Expiration Date: " + expireDate);
		
	}
}
