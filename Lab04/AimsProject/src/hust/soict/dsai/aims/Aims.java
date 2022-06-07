package hust.soict.dsai.aims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cart anOrder = new Cart();
		
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "RogerAllers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Alchemist", "Novel", "Paulo Coelho", 10.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Untethered soul", "Story", "Michael A.Singer", 14.95f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Canslim", "Document", "Matthew Galgani", 18.95f);
	
		
		Store myStore = new Store();

		myStore.addDVD(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6);
			
		//myStore.removeDVD(dvd2);
		

		//System.out.print("Total cost is: ");
		//System.out.println(anOrder.totalCost());
		
		//System.out.print("Total disc: ");
		//System.out.println(anOrder.qtyOrdered());	
		execute(myStore, anOrder);
		
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
	
	public static void keep(Store store, Cart cart) {
		System.out.println("\nDO YOU WANT TO CONTINUE ORDERING ?");
		System.out.println("1.Yes");
		System.out.println("0.No");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1");
		int ans = Integer.valueOf(scanner.nextLine());
		if (ans == 0) {
			System.out.println("Finished exit !");
			System.exit(0);
			}
		else if (ans == 1) {
			execute(store,cart);
			}
		else {
			System.out.println("Invalid option!");
			keep(store,cart);
			}
	}
	
	
	
	
	

	public static void execute(Store store,Cart cart) {
		showMenu();
		int number = Integer.valueOf(scanner.nextLine());
		if (number > 3 || number < 0) {
			System.out.println("Invalid option!");
			keep(store,cart);
			}
			
		switch (number) { // 4 option: 0,1,2,3
		
		////-------toooo_long_T.T--------------
		
		case 1:
			Store.Display();
			storeMenu();
			int choice = Integer.valueOf(scanner.nextLine());
			if (choice > 3 || choice < 0) {
				System.out.println("Invalid option!");
				keep(store,cart);
				}
			else if (choice == 1){
				System.out.println("Enter title: ");
				String inputTitle = scanner.nextLine();
				Boolean test = false;
				for (DigitalVideoDisc item: store.itemsInStore) {
					if (item.isMatch(inputTitle)) {
						test = true;
						store.search(inputTitle);
						System.out.println("Add this to cart?");
						System.out.println("1. Yes ");
						System.out.println("2. No ");
						System.out.println("-----------------");
						System.out.println("Please choose a number: 1-2");
						int choice2 = Integer.valueOf(scanner.nextLine());
						if (choice2 == 1) {
							store.add_to_cart(item.getTitle());
							}
						else { break; }
					}
					else {
						System.out.println("No match found");
					}
				}	
			}
				
			else if (choice == 2) {
				store.Display();
				System.out.println("Enter title: ");
				String inputTitle = scanner.nextLine();
				store.add_to_cart(inputTitle);
				}
			else if (choice == 3) {
				store.cart.Display();
				cartMenu();
				//---------
				}
		case 2:
			update_store();
			int choice3 = Integer.valueOf(scanner.nextLine());
			if (choice3 > 2 || choice3 < 0) {
				System.out.println("Invalid option!");
				keep(store,cart);
				}
			else if (choice3 == 1) {
				System.out.println("Add a DVD");
			}
			else if (choice3 == 2) {
				System.out.println("Remove a DVD");
			}
			
		case 3:
			store.cart.Display();
			cartMenu();
			//-----------------
			
					
		} //-----switch---------
		
	} //----execute---------
	
	
}
