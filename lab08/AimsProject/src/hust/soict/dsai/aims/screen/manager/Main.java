package hust.soict.dsai.aims.screen.manager;

import hust.soict.dsai.aims.Store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Main {

	 
	public static void main(String[] args) {
		
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Lion King", "Animation", "RogerAllers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin", "Animation", 18.99f);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc(4,"The Alchemist", "Novel", "Paulo Coelho", 10.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc(5,"The Untethered soul", "Story", "Michael A.Singer", 14.95f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc(6,"Canslim", "Document", "Matthew Galgani", 18.95f);
	
		store.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5);
		new StoreManagerScreen(store);

	}

}
