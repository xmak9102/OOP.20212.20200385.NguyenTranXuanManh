package hust.soict.dsai.aims;
import  hust.soict.dsai.aims.cart.*;
import  hust.soict.dsai.aims.media.*;
import java.util.ArrayList;

public class Store {
	public static ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public static ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	public void addMedia(Media...disc){
		for (int i = 0; i < disc.length;i++) {
			itemsInStore.add(disc[i]);
				}
		System.out.println("Media has been added to store");
		}

	
	public void removeMedia(Media ... discs) {
		try {
		for(int i = 0; i<discs.length;i++) {
			Media name = discs[i];
			int t = itemsInStore.indexOf(name);
			itemsInStore.remove(t);}
		System.out.println("Media has been removed");
		}
		catch(Exception e) 
		{System.out.println("Something went wrong");}
	}
	
	public static void Display() {
		for (Media item: itemsInStore) {
			System.out.println(item.toString());
		}
	}
	
	public void search(int id) {
		boolean test = false;
		for (int i =0;i< itemsInStore.size();i++) {
			if (itemsInStore.get(i).getId() == id) {
				test = true;
				System.out.println(itemsInStore.get(i));
				break;	}
			}
		if (test == false) {
			System.out.println("No match found!");
			}
	}
	public void search(String title) {
		boolean test = false;
		for (int i =0;i< itemsInStore.size();i++) {
			if(itemsInStore.get(i).getTitle() != title) {
				continue;
				}
			else if(itemsInStore.get(i).getTitle().equals(title)){
				test = true;
				System.out.println(itemsInStore.get(i));
				break;
				}
			}
		if (test == false) {
			System.out.println("No match found!");
			}
		}
	/*
	public void add_to_cart(String title,Cart cart) {
		Media it = null;
		for (int i =0;i< itemsInStore.size();i++) {
			if(itemsInStore.get(i).getTitle() != title) {
				continue;
				}
			else if(itemsInStore.get(i).getTitle().equals(title)){
				it = itemsInStore.get(i);
					}
			}
		cart.addMedia(it);
		}
		*/
}


