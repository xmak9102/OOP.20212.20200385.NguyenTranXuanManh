package hust.soict.dsai.aims.cart;

import  hust.soict.dsai.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.naming.LimitExceededException;

public class Cart{
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	
	public static ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	public static List<Media> tmp = new ArrayList<Media>();
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
	public void addMedia(Media ... media) throws LimitExceededException{
		if (itemsOrdered.size()<= MAX_NUMBERS_ORDERED) {
			for(int i = 0; i<media.length;i++)
				{itemsOrdered.add(media[i]);}
			System.out.println("The discs has been added to cart");
			}
		
		else {
			throw new LimitExceededException("Error: The number of media has reached its limit");
		}
	}
	
	
	public void removeMedia(Media ... media) {
		try {
		for(int i = 0; i<media.length;i++) {
			Media name = media[i];
			int t = itemsOrdered.indexOf(name);
			itemsOrdered.remove(t);}
		System.out.println("Media has been removed");
		}
		catch(Exception e) 
		{System.out.println("Something went wrong");}
	}
	
	public int qtyOrdered() {
		return itemsOrdered.size();
		}
	
	public String totalCost() {
		Float total = (float) 0.0;
		for (int i = 0; i<itemsOrdered.size();i++) {
			if(itemsOrdered.get(i) != null) {
				total += itemsOrdered.get(i).getCost();
				}
			}
		
		if (itemsOrdered.size() >= 5) {
				total -= getALuckyItem().getCost();
				}
			
		String round_total = String.format("%.2f", total);
		return round_total;
	}

	public List<Media> search2(int id) {
		List<Media> match = new ArrayList<Media>();
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (Integer.toString(itemsOrdered.get(i).getId()).startsWith(Integer.toString(id))) {
				match.add(itemsOrdered.get(i));
			}
		}
		return match;
	}
	public List<Media> search2(String title) {
		List<Media> match = new ArrayList<Media>();
		for (int i = 0; i < itemsOrdered.size(); i++) {
			if (itemsOrdered.get(i).getTitle().startsWith(title)) {
				match.add(itemsOrdered.get(i));
			}
		}
		return match;
	}
	public void search(int id) {
		boolean test = false;
		for (int i =0;i< itemsOrdered.size();i++) {
			if (itemsOrdered.get(i).getId() == id) {
				test = true;
				System.out.println(itemsOrdered.get(i));
				break;	}
			}
		if (test == false) {
			System.out.println("No match found!");
			}
	}
	
	public void search(String title) {
		boolean test = false;
		for (int i =0;i< itemsOrdered.size();i++) {
			if(itemsOrdered.get(i).getTitle() != title) {
				continue;
				}
			else if(itemsOrdered.get(i).getTitle().equals(title)){
				test = true;
				System.out.println(itemsOrdered.get(i));
				break;
				}
			}	
		if (test == false) {
			System.out.println("No match found!");
			}
	}
	
	public static void Sort_by_title() {
		
		Collection<Media> collection = new ArrayList<Media>();
		for (Media i:itemsOrdered) {
			collection.add(i);
			}
		
		Iterator<Media> iterator = collection.iterator();
		Collections.sort((List) collection, Media.By_title_cost);
		iterator = collection.iterator();
		while (iterator.hasNext()) {
		System.out.println(((Media)iterator.next()).toString());
				}
		}
	
	public static void Sort_by_cost() {
			
		Collection<Media> collection = new ArrayList<Media>();
		for (Media i:itemsOrdered) {
			collection.add(i);
		}
		Iterator<Media> iterator = collection.iterator();
		Collections.sort((List) collection, Media.By_cost_title);
		iterator = collection.iterator();
		while (iterator.hasNext()) {
		System.out.println(((Media)iterator.next()).toString());
			}
		

	}
	public void Display() {
		
		ArrayList<Media> sorted = new ArrayList<>();
		for(int i = 0; i<itemsOrdered.size();i++){
			sorted.add(itemsOrdered.get(i));
					}
		//Collections.sort(itemsOrdered, Comparator.comparing(e -> ((DigitalVideoDisc)e).getCost()));	
		//sorted.sort(Comparator.comparing(e -> ((Media)e).getTitle()).
				           //thenComparing(e -> ((Media)e).getCost()));
						//.thenComparing(e -> ((DigitalVideoDisc)e).getLength())
		System.out.println("***********************CART***********************\r\n"
				+ "Ordered Items:");	
		for(int i = 0; i < sorted.size();i+=1) {
			System.out.println(sorted.get(i));
				}
		System.out.println("Total cost: ["+totalCost()+"]\r\n"
				+ "***************************************************");
			}
		
	public static Media getALuckyItem() {
		Random random = new Random();
		int i = random.nextInt(itemsOrdered.size());
		return itemsOrdered.get(i);	
	}

	
}
