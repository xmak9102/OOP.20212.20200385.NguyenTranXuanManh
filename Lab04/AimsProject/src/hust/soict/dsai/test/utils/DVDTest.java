package hust.soict.dsai.test.utils;

import java.util.List;

import hust.soict.dsai.aims.utils.DVDUtils;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DVDTest {
	public static void main(String[] args) {
		
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA", "aaaa","aaaa",1, 5f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("AAAA", "bbbb","bbbb",2, 5.3f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("AAAA", "cccc","cccc",3, 5.6f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD", "dddd","dddd",4, 7.1f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE", "eeee","eeee",5, 3.3f);

		
		System.out.println(DVDUtils.compareByCost(dvd1, dvd2));
		System.out.println(DVDUtils.compareByTitle(dvd5, dvd3));

		List<DigitalVideoDisc> sorted;
		//DigitalVideoDisc[] sorted;
		
		sorted = DVDUtils.Sort_by_cost(new DigitalVideoDisc[] {dvd1, dvd2, dvd3, dvd4, dvd5});
		System.out.println("Sort by cost: ");
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i).getCost());
		}
		System.out.println("");
		sorted = DVDUtils.Sort_by_title(dvd1, dvd2, dvd3, dvd4, dvd5);
		System.out.println("Sort by title: ");
		for (int i = 0; i < sorted.size(); i++) {
			System.out.println(sorted.get(i).getTitle());		}
		
		cart.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd4, dvd5);
		
		cart.Display();
	}
}
