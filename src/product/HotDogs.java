package product;

public class HotDogs extends Products {
	private boolean addCheese;
	private boolean addMustard;
	private boolean addKetchup;
	private boolean addChilli;

	public boolean isAddCheese() {
		return addCheese;
	}

	public void setAddCheese(boolean addCheese) {
		this.addCheese = addCheese;
	}

	public boolean isAddMustard() {
		return addMustard;
	}

	public void setAddMustard(boolean addMustard) {
		this.addMustard = addMustard;
	}

	public boolean isAddKetchup() {
		return addKetchup;
	}

	public void setAddKetchup(boolean addketchup) {
		this.addKetchup = addketchup;
	}

	public boolean isAddChilli() {
		return addChilli;
	}

	public void setAddChilli(boolean addChilli) {
		this.addChilli = addChilli;
	}

	// Constructor
	public HotDogs(String name, String category, String description, double price, boolean addCheese,
			boolean addKetchup, boolean addMustard, boolean addChilli) {
		setName(name);
		setCategory(category);
		setDescription(description);
		setPrice(price);
		setAddCheese(addCheese);
		setAddKetchup(addKetchup);
		setAddMustard(addMustard);
		setAddChilli(addChilli);

	}

	@Override
	public void specificProductDetails() {
		// TODO Auto-generated method stub
		generalProductDetails();
		System.out.println("Option: ");
		if (addCheese == false && addKetchup == false&& addMustard&& addChilli == false) {
			System.out.println("No options selected");
		}
		else {
			System.out.println();
			if(addCheese == true) {	
				System.out.println("add Cheese\n");
			}
			if(addMustard == true) {	
				System.out.println("add Mustard\n");
			}
			if(addKetchup == true) {	
				System.out.println("add Ketchup\n");
			}
			if(addChilli == true) {	
				System.out.println("add Chilli\n");
			}
		}
	}

}
