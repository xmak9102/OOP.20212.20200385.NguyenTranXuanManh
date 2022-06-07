package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.*;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The lion King","Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"Star Wars","Science Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Aladin","Animation",18.99f);
		
		cart.addMedia(dvd1,dvd2,dvd3);
		
		
		//--------Test_goes_here-----------
		DigitalVideoDisc dvd4 = new DigitalVideoDisc(4,"The lord of the rings", "Science Fiction","J.R.R.Tolkien", 22.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc(5,"Pay back time", "Documents", "Phil Towm", 20.95f);

		cart.addMedia(dvd4, dvd5);
		//cart.removeMedia(dvd4, dvd2, dvd1);

		//cart.search(2);
		//cart.search("Aladin");
		//cart.search("The lord of the rings");
		//cart.search("Doremon");

		//cart.Sort_by_title();
		
		
		cart.Display();
		
	}

}
