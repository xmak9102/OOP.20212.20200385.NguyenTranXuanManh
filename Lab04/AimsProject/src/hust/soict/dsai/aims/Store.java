package hust.soict.dsai.aims;

import java.util.ArrayList;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	static ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

	public void addDVD(DigitalVideoDisc...disc){
		for (int i = 0; i < disc.length;i++) {
			itemsInStore.add(disc[i]);
				}
		System.out.println("DVDs has been added to store");
		}

	
	public void removeDVD(DigitalVideoDisc ... discs) {
		try {
		for(int i = 0; i<discs.length;i++) {
			DigitalVideoDisc name = discs[i];
			int t = itemsInStore.indexOf(name);
			itemsInStore.remove(t);}
		System.out.println("DVDs has been removed");
		}
		catch(Exception e) 
		{System.out.println("Something went wrong");}
	}
	
	public static void Display() {
		for (DigitalVideoDisc item: itemsInStore) {
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
	
	
	Cart cart = new Cart();
	
	public void add_to_cart(String title) {
		DigitalVideoDisc it = null;
		for (int i =0;i< itemsInStore.size();i++) {
			if(itemsInStore.get(i).getTitle() != title) {
				continue;
				}
			else if(itemsInStore.get(i).getTitle().equals(title)){
				it = itemsInStore.get(i);
					}
			}
		cart.addDigitalVideoDisc(it);
		}
}

