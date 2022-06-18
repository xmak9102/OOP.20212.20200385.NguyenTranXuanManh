package hust.soict.dsai.test.media;

import java.util.*;
import java.util.Collection;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.utils.MediaComparatorByTitleCost;


public class TestMediaCompareTo {

	public static void main(String[] args) {
		
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"Lion King", "Animation", "RogerAllers", 87, 19.95f);
		
		Book dvd2 = new Book(2,"Star Wars", "Science Fiction", null, 24.99f);
		
		CompactDisc dvd3 = new CompactDisc(3,"Aladin", "Animation", null, null, 45, 18.99f);
		
		CompactDisc dvd4 = new CompactDisc(4,"The Alchemist", "Novel", "Paulo Coelho", null, 90, 10.95f);
		Book dvd5 = new Book(5,"The Alchemist", "Story", null , 14.95f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc(6,"Canslim", "Document", "Matthew Galgani", 18.95f);
		
		Collection<Media> collection = new ArrayList<Media>();
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		collection.add(dvd4);
		collection.add(dvd5);
		collection.add(dvd6);
	
		List<Media> items = new ArrayList<Media>();
		items.add(dvd6);
		items.add(dvd5);
		items.add(dvd4);
		items.add(dvd3);
		items.add(dvd2);
		items.add(dvd1);
		
		Iterator<Media> iterator = collection.iterator();
		
		/*
		while (iterator.hasNext()) {
		System.out.println(((DigitalVideoDisc)iterator.next()).toString());
			}
		
		System.out.println("---------------------------------");
		System.out.println("The DVDs currently in the order are: ");
		
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).toString());
			}
		
		//Collections.sort((List)collection);
		Collections.sort((List<Media>)collection);
		
		iterator = collection.iterator();
	
		System.out.println("---------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).toString());
			}
		*/
		
		
		
		//Collections.sort((List) collection, new MediaComparatorByTitleCost());
		Collections.sort((List) collection, Media.By_title_cost);

		iterator = collection.iterator();
		while (iterator.hasNext()) {
		System.out.println(((Media)iterator.next()).toString());
			}
		
	}
		
		
}

	

