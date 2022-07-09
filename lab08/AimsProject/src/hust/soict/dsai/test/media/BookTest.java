package hust.soict.dsai.test.media;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class BookTest {

	public static void main(String[] args) {
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"Lion King", "Animation", "RogerAllers", 87, 19.95f);
		
		Book dvd2 = new Book(2,"Star Wars", "Science Fiction", null, 24.99f);
		
		CompactDisc dvd3 = new CompactDisc(3,"Aladin", "Animation", null, null, 45, 18.99f);
		
		CompactDisc dvd4 = new CompactDisc(4,"The Alchemist", "Novel", "Paulo Coelho", null, 90, 10.95f);
		Book dvd5 = new Book(5,"The Alchemist", "Story", null , 14.95f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc(6,"Canslim", "Document", "Matthew Galgani", 18.95f);
		

	}

}
