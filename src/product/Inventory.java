package product;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Inventory {

	// There are two maps used to keep inventory. We will conceptualize them as
	// OutterMap<String,InnerMap<String,Integer>>
	// We want this static so it belongs to the class and not the Instance. so that
	// we have only one TreeMap field that is updated instead of one for each
	// instance.

	// Plus one if we have time
	// Static Map<Integer, Map<String, Integer>> inventory = new TreeMap<Integer,
	// Map<String, Integer>>();
	// Fields

	private TreeMap<Integer, Products> inventory = new TreeMap<Integer, Products>();
	private int productID = 0;

	// Get Set
	public TreeMap<Integer, Products> getInventory() {
		return inventory;
	}

	public void setInventory(Products product) {
		inventory.put(setID(), product);
		System.out.println(productID);
	}

//Constructor, only need a default one
	public Inventory() {
	}

//methods
	// Setting the key value ( which is used as the product ID) will be handled by
	// the class so we dont run into exceptions regarding repeat keys.
	private int setID() {
		try {
			if (productID == 0) {
				productID++;
				return 0;
			} else if (productID == inventory.lastKey()) {
				productID++;
			}
		} catch (Exception e) {
			System.out.println("an error occured when setting the ID of the product");
		}
		return productID;

	}

	public  void showInventory() {
		String header = String.format("|%20d %20d %20d|", "ID","Product Name","Price");
		 for (Entry<Integer, Products> entry : inventory.entrySet()) 
			 
	            System.out.println("Product ID = " + entry.getKey() + ", Product = " + entry.getValue());
	            
	}

}
