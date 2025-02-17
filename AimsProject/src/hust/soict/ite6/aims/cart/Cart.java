package hust.soict.ite6.aims.cart;

import java.util.*;

import javax.naming.LimitExceededException;

import hust.soict.ite6.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public int qtyOrdered = 0;
    
	public String addMedia(Media media) throws LimitExceededException {
		if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
			throw new LimitExceededException("ERROR: The number of media has reached its limit");
		} else if (itemsOrdered.contains(media)){
			return media.getTitle() + " is already in the cart!";
		} else {
			itemsOrdered.add(media);
			return (media.getTitle() + "has been added!");
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Nothing to remove!");
		} else {
			if (itemsOrdered.remove(media)) {
				System.out.println(media.getTitle() + "has been remove from the cart.");
			} else {
				System.out.println("Media not found in cart!");
			}
		}
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (Media media : itemsOrdered) {
			totalCost += media.getCost();
		}
		return totalCost;
	}
	
    public void print()
    {
    	System.out.println("**************************CART***********************");
    	System.out.println("Ordered Items:");
    	int i=0;
    	for (Media media : itemsOrdered)
    	{
    		i += 1;
    		System.out.println(i + "." + media);
    	}
    	System.out.println("Total cost: " + totalCost());
    	System.out.println("*****************************************************");
    }
    
    // Search to remove
    public Media searchToRemove(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				return media;
			}
		}
		return null;
	}
    
    public void searchByID(int id)
    {
    	boolean found = false;
    	for (Media media : itemsOrdered)
    	{
    		if (media.getId() == id)
    		{
    			System.out.println("Found" + media);
    			found = true;
    		}
    	}
    	if (found==false)
    	{
    		System.out.println("Sorry, no DVDs were found that match the ID provided!");
    	}
    }
    
    public void searchByTitle(String keyword)
    {
    	boolean matchFound = false;
    	for (Media media : itemsOrdered)
    	{
    		if (media.isMatch(keyword))
    		{
    			System.out.println("Found" + media);
    			matchFound = true;
    		}
    	}
    	if (matchFound == false)
    	{
    		System.out.println("Sorry, no DVDs were found with \"" + keyword +"\" in the title!");
    	}
    }
    
    public void searchByCategory(String category) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getCategory().equalsIgnoreCase(category)) {
                System.out.println("Found" + media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Sorry, no DVDs matching the \"" + category + "\" category were found!");
        }
    }
    
    public void searchByPrice(float maxCost) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getCost() <= maxCost) {
                System.out.println("Found" + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no DVDs were found that match the maximum cost provided!");
        }
    }
    
    public void searchByPrice(float minCost, float maxCost) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getCost() >= minCost && media.getCost() <= maxCost) {
                System.out.println("Found" + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no DVDs were found that match the cost range between your specified minimum and maximum!");
        }
    }
    
    public void empty() {
        if (itemsOrdered.size() == 0) {
            System.out.println("Nothing to remove!");
        } else {
            qtyOrdered = 0;
            itemsOrdered.clear();
            System.out.println("Order created.");
            System.out.println("Now your current cart will be empty!");
            System.out.println();
        }
    }
    
    // Sort media in cart
    public void sortMediaByTitle() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_TITLE_COST);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    public void sortMediaByCost() {
        Collections.sort((List<Media>)itemsOrdered, Media.COMPARE_BY_COST_TITLE);
        Iterator<Media> iterator = itemsOrdered.iterator();
        iterator = itemsOrdered.iterator();
    
        while (iterator.hasNext()) {
            System.out.println(((Media)iterator.next()).toString());
        }
    }
    
    public String placeOrder() {
    	if(itemsOrdered.size()==0) {
    		return "Your cart is empty!";
    	} else {
    		qtyOrdered = 0;
    		itemsOrdered.clear();
    		return "Order created!\n" + "Now your cart will be empty!";
    	}
    }
}