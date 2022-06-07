package hust.soict.dsai.aims;

import  hust.soict.dsai.aims.cart.*;
import  hust.soict.dsai.aims.media.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Aims {

	
	static Cart cart = new Cart();
	static Store store = new Store();
	
	public static void main(String[] asrgs) {		
		
		
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
		showMenu();
		
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
	public static void showMenu() {
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
			storeMenu();
		case 2:
			update_store();
		case 3:
			cart.Display();
			cartMenu();
		case 0:
			System.out.println("Finished exit!");
			System.exit(0);
				}
			}
	
	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a DVD details");
		System.out.println("2. Add a DVD to cart");
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
			System.out.println("Enter title: (case sensitive) ");
			String input_title = String.valueOf(scanner.nextLine());
			store.search(input_title);
			storeMenu();
			
		//----problem-----
		case 2:
			store.Display();
			System.out.println("Enter title: (case sensitive) ");
			String input_title2 = String.valueOf(scanner.nextLine());
			store.add_to_cart(input_title2, cart);
			storeMenu();
		case 3:
			cart.Display();
			cartMenu();
		case 0:
			showMenu();
				}
			}

	public static void cartMenu() {
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
			storeMenu();
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
				cartMenu();
				}
			cartMenu();
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
				cartMenu();
			case 2:
				cart.Sort_by_cost();
				cartMenu();
			case 0:
				cartMenu();
				}
			cartMenu();
		case 3:
			System.out.println("remove dvd...");
			showMenu();
		case 4:
			System.out.println("Order success!");
			cart.itemsOrdered = null;
			showMenu();
			}	
		}
	
	public static void update_store() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add a DVD");
		System.out.println("2. Remove a DVD");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	
	
	
}
