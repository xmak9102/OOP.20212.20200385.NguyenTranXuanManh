package hust.soict.dsai.test;
import hust.soict.dsai.aims.media.*;

import java.util.Scanner;

import hust.soict.dsai.aims.*;
import hust.soict.dsai.aims.cart.*;


public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store store = new Store();
		Cart cart = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Alchemist", "Novel", "Paulo Coelho", 10.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"The Untethered soul", "Story", "Michael A.Singer", 14.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Canslim", "Document", "Matthew Galgani", 18.95f);
	
		store.addMedia(dvd1, dvd2, dvd3);
		//store.removeDVD(dvd3);
		
		store.Display();
		
		Scanner scanner = new Scanner(System.in);
		String input_title = scanner.nextLine();
		for (Media i: store.itemsInStore) {
			if (i.isMatch(input_title)) {
				cart.addMedia(i);
			}
		}
		
		store.add_to_cart("The Untethered soul",cart);
		
		cart.Display();
		
	}

}
