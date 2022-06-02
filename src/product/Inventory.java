package product;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
		productID++;
//		System.out.println(productID);
	}

//Constructor, only need a default one
	public Inventory() {
	}

//methods
	//set key for the inventory Treemap
	private int setID() {
		try {
			if (productID == 0) {
				return 0;
			}
		} catch (Exception e) {
			System.out.println("an error occured when setting the ID of the product");
		}
		return productID;

	}
	//display this objects inventory
	public void showInventoryAll() {
		String header = String.format("%-5s|%20s |%10s|", "ID", "Product Name", "Price");
		String header1 = String.format("---------------------------------------");
		System.out.println(header);
		System.out.println(header1);
		for (Entry<Integer, Products> entry : getInventory().entrySet()) {
			String lineItem = String.format("%-5d|%20s |%10s|", entry.getKey(), entry.getValue().getName(),
					entry.getValue().getPrice());
			System.out.println(lineItem);

		}

	
//	public void showInventoryCatagories() {
//		//used a set because we only want unique categories.
//		Set<String> listOfCategories = new TreeSet<String>();
//		int id = 0;
//		for (Entry<Integer, Products> entry : getInventory().entrySet()) {
//			listOfCategories.add(entry.getValue().getCategory());
//		}
//		for (String category:listOfCategories ) {
//			String lineItem = String.format("%-5d|%20s |%10s|", id ,)
//					
//		}
//		}
		
	}
		
	}
