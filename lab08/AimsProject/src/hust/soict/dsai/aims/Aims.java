package hust.soict.dsai.aims;

import  hust.soict.dsai.aims.cart.*;
import  hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.naming.LimitExceededException;


public class Aims {

	
	 
	
	public static void main(String[] asrgs) throws LimitExceededException {		
		
		Cart cart = new Cart();
		Store store = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", "RogerAllers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin", "Animation", 18.99f);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc(4,"The Alchemist", "Novel", "Paulo Coelho", 10.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc(5,"The Untethered soul", "Story", "Michael A.Singer", 14.95f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc(6,"Canslim", "Document", "Matthew Galgani", 18.95f);
	
		store.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6);
		//myStore.removeDVD(dvd2);
		
		//System.out.print("Total cost is: ");
		//System.out.println(anOrder.totalCost());
		
		//System.out.print("Total disc: ");
		//System.out.println(anOrder.qtyOrdered());	
		
		showMenu(store, cart);
		
		/*MemoryDaemon daemon = new MemoryDaemon();
		//daemon.run();
		System.out.println(daemon.memory_used);
		daemon.setDaemon(true);
		*/
		}
	
	public static void Keep() {
		System.out.println("\nDO YOU WANT TO CONTINUE ORDERING ?");
		System.out.println("1.Yes");
		System.out.println("0.No");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
		Scanner scanner = new Scanner(System.in);
		int ans = Integer.valueOf(scanner.nextLine());
		if (ans == 0) {
			System.out.println("Finished exit!");
			System.exit(0);
			}
		else if (ans == 1) {
			System.out.println("Please continue your orders!");
		}
		else {
			System.out.println("Invalid option!");
			Keep();
			}
		}
	public static void showMenu(Store store, Cart cart) throws LimitExceededException {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		
		Scanner scanner = new Scanner(System.in);
		int number = Integer.valueOf(scanner.nextLine());
		if (number > 3 || number < 0) {
			System.out.println("Invalid option!");
			Keep();
			}
		switch (number) {
		case 1:
			storeMenu(store, cart);
		case 2:
			update_store(store, cart);
		case 3:
			cart.Display();
			cartMenu(store, cart);
		case 0:
			System.out.println("Finished exit!");
			System.exit(0);
				}
			}
	
	public static void storeMenu(Store store, Cart cart) throws LimitExceededException {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media details");
		System.out.println("2. Add media to cart");
		System.out.println("3. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.valueOf(scanner.nextLine());
		if (number > 3 || number < 0) {
			System.out.println("Invalid option!");
			Keep();
			}
		switch (number) {
		case 1:
			System.out.println("Enter title: (insensitive letter) ");
			String input_title = scanner.nextLine();
			for (Media i: store.itemsInStore) {
				if (i.isMatch(input_title)) {
					//System.out.println("[" + i.getId() +"] - ["+ i.getTitle()+"] - ["+ i.getCategory() +"] : ["+ i.getCost()+"]$");
					System.out.println(i.toString());
				}
			}			
			storeMenu(store, cart);
			
		
		case 2:
			store.Display();
			System.out.println("Enter title: (insensitive letter) ");
			String input_title2 = scanner.nextLine();
			for (Media i: store.itemsInStore) {
				if (i.isMatch(input_title2)) {
					cart.addMedia(i);
				}
			}
			storeMenu(store, cart);
		case 3:
			cart.Display();
			cartMenu(store, cart);
		case 0:
			showMenu( store,  cart);
				}
			}

	public static void cartMenu(Store store,Cart cart) throws LimitExceededException {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter DVDs in cart");
		System.out.println("2. Sort DVDs in cart");
		System.out.println("3. Remove DVD from cart");
		System.out.println("4. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.valueOf(scanner.nextLine());
		if (number > 4 || number < 0) {
			System.out.println("Invalid option!");
			Keep();
			}
		switch(number) {
		case 0:
			storeMenu(store, cart);
		case 1:
			System.out.println("Filter by: ");
			System.out.println("1.Title");
			System.out.println("2.Cost");
			System.out.println("0.Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
			int number2 = Integer.valueOf(scanner.nextLine());
			if (number2 > 2 || number < 0) {
				System.out.println("Invalid option!");
				Keep();
				}
			switch(number2) {
			case 1:
				cart.Sort_by_title();
			case 2:
				cart.Sort_by_cost();
			case 0:
				cartMenu(store, cart);
				}
			cartMenu(store, cart);
		case 2:
			System.out.println("Sort by: ");
			System.out.println("1.Title");
			System.out.println("2.Cost");
			System.out.println("0.Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
			int number3 = Integer.valueOf(scanner.nextLine());
			if (number3 > 2 || number < 0) {
				System.out.println("Invalid option!");
				Keep();
				}
			switch(number3) {
			case 1:
				cart.Sort_by_title();
				cartMenu(store, cart);
			case 2:
				cart.Sort_by_cost();
				cartMenu(store, cart);
			case 0:
				cartMenu(store, cart);
				}
			cartMenu(store, cart);
		case 3:
			cart.Display();
			System.out.println("Enter title: (insensitive) ");
			String input_title = scanner.nextLine();
			for (Media i: store.itemsInStore) {
				if (i.isMatch(input_title)) {
					cart.removeMedia(i);
				}
			}
			cartMenu(store, cart);
			
		case 4:
			System.out.println("Order success!");
			cart.itemsOrdered = null;
			System.exit(0);
			}	
		}
	
	public static void update_store(Store store, Cart cart) throws LimitExceededException {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add a DVD");
		System.out.println("2. Remove a DVD");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
		Scanner scanner = new Scanner(System.in);
		int number = Integer.valueOf(scanner.nextLine());
		if (number > 2 || number < 0) {
			System.out.println("Invalid option!");
			Keep();
			}
		else {
			switch(number) {
			case 0: showMenu(store, cart);
			case 1: 
				System.out.println("For simplify...");
				System.out.println("Media has been add");
				update_store(store, cart);
			case 2:
				store.Display();
				System.out.println("Enter title: (insensitive) ");
				String input_title = scanner.nextLine();
				for (Media i: store.itemsInStore) {
					if (i.isMatch(input_title)) {
						store.removeMedia(i);
					}
				}
			}
		}
	}
	
	
	
	
}
