package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King","Animation","Roger Allers",87,19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
		
		cart.addDigitalVideoDisc(dvd1,dvd2,dvd3);
		
		
		//--------Test_goes_here-----------
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("The lord of the rings", "Science Fiction","J.R.R.Tolkien", 22.95f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Pay back time", "Documents", "Phil Towm", 20.95f);

		cart.addDigitalVideoDisc(dvd4, dvd5);
		cart.removeDigitalVideoDisc(dvd4, dvd2, dvd1);

		//cart.search(2);
		//cart.search("Aladin");
		//cart.search("The lord of the rings");
		//cart.search("Doremon");

		//cart.Sort_by_title();
		
		
		cart.Display();
		
	}

}
