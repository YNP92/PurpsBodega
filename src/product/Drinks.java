package product;

public class Drinks extends Products {
	//Drinks: Coffee, Beer, Water
	// Fields in addition to Product

	private boolean containsAlcohol = false;
	private int cream = 0 ;
	private int sugar = 0;

	// Getters Setters
	public boolean isContainsAlcohol() {
		return containsAlcohol;
	}

	public void setContainsAlcohol(boolean containsAlcohol) {
		this.containsAlcohol = containsAlcohol;
	}

	public int isCream() {
		return cream;
	}

	public void setCream(int cream) {
		this.cream = cream;
	}

	public int isSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	// Constructors:
	// Default for non alcoholic drinks
	public Drinks(String name, String category, String description, double price) {
		setName(name);
		setCategory(category);
		setDescription(description);
		setPrice(price);
	}

	// For alcoholic drinks.
	public Drinks(String name, String category, String description, double price, boolean containsAlcohol) {
		setName(name);
		setCategory(category);
		setDescription(description);
		setPrice(price);
		setContainsAlcohol(containsAlcohol);

	}

	// Constructor for Coffee
	public Drinks(String name, String category, String description, double price, int cream, int sugar) {
		setName(name);
		setCategory(category);
		setDescription(description);
		setPrice(price);
		if (cream < 0) {
			setCream(0);
		} else {
			setCream(cream);
		}
		if (sugar < 0) {
			setSugar(0);
		} else {
			setSugar(sugar);
		}

	}

	@Override
	public void specificProductDetails() {
		generalProductDetails();
		if (containsAlcohol == true) {
			System.out.println("Beverage: is alcoholic");
		}
		if (cream >= 1 || sugar >= 1) {
			System.out.println(" Cofee with " + cream + " cream and " + sugar + " sugar ");
		}

	}

}
