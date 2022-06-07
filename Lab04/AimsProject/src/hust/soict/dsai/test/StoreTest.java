package hust.soict.dsai.aims;


import hust.soict.dsai.aims.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store store = new Store();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Alchemist", "Novel", "Paulo Coelho", 10.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Untethered soul", "Story", "Michael A.Singer", 14.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Canslim", "Document", "Matthew Galgani", 18.95f);
	
		store.addDVD(dvd1, dvd2, dvd3);
		//store.removeDVD(dvd3);
		
		store.Display();
		
		store.add_to_cart("Canslim");
		
		store.cart.Display();
		
	}

}
