package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart{
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public static ArrayList<DigitalVideoDisc> arl = new ArrayList<DigitalVideoDisc>();
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc ... discs ) {
		if (arl.size() + discs.length <= MAX_NUMBERS_ORDERED) {
		for(int i = 0; i<discs.length;i++)
			{arl.add(discs[i]);}
		System.out.println("The discs has been added to cart");
			}
		
		else {System.out.println("The cart is almost full");}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc ... discs) {
		try {
		for(int i = 0; i<discs.length;i++) {
			DigitalVideoDisc name = discs[i];
			int t = arl.indexOf(name);
			arl.remove(t);}
		System.out.println("DVDs has been removed");
		}
		catch(Exception e) 
		{System.out.println("Something went wrong");}
	}
	
	public int qtyOrdered() {
		return arl.size();
		}
	
	public static double totalCost() {
		Float total = (float) 0.0;
		for (int i = 0; i<arl.size();i++) {
			total += arl.get(i).getCost();
		}
		return Math.round(total * 100.0)/100.0;
	}

	
	public void search(int id) {
		boolean test = false;
		for (int i =0;i< arl.size();i++) {
			if (arl.get(i).getId() == id) {
				test = true;
				System.out.println(arl.get(i));
				break;	}
			}
		if (test == false) {
			System.out.println("No match found!");
			}
	}
	
	public void search(String title) {
		boolean test = false;
		for (int i =0;i< arl.size();i++) {
			if(arl.get(i).getTitle() != title) {
				continue;
				}
			else if(arl.get(i).getTitle().equals(title)){
				test = true;
				System.out.println(arl.get(i));
				break;
				}
			}
				
		if (test == false) {
			System.out.println("No match found!");
			}
	}
	
	public static void Sort_by_title() {
		
		List<DigitalVideoDisc> sorted = new ArrayList<>();
		for(int i = 0; i<arl.size();i++){
			sorted.add(arl.get(i));
				}
		//Collections.sort(arl, Comparator.comparing(e -> ((DigitalVideoDisc)e).getTitle()));
		sorted.sort(Comparator.comparing(e -> ((DigitalVideoDisc)e).getTitle()));
		
		for(int i = 0; i < sorted.size();i+=1) {
			System.out.println(sorted.get(i));
			}
		}
	
	public static void Sort_by_cost() {
			
		List<DigitalVideoDisc> sorted = new ArrayList<>();
		for(int i = 0; i<arl.size();i++){
			sorted.add(arl.get(i));
					}
		//Collections.sort(arl, Comparator.comparing(e -> ((DigitalVideoDisc)e).getCost()));	
		sorted.sort(Comparator.comparing(e -> ((DigitalVideoDisc)e).getCost()));
			
		for(int i = 0; i < sorted.size();i+=1) {
			System.out.println(sorted.get(i));
				}
	}
	
	public static void Display() {
		List<DigitalVideoDisc> sorted = new ArrayList<>();
		for(int i = 0; i<arl.size();i++){
			sorted.add(arl.get(i));
					}
		//Collections.sort(arl, Comparator.comparing(e -> ((DigitalVideoDisc)e).getCost()));	
		sorted.sort(Comparator.comparing(e -> ((DigitalVideoDisc)e).getTitle()).
				           thenComparing(e -> ((DigitalVideoDisc)e).getCost()).
				           thenComparing(e -> ((DigitalVideoDisc)e).getLength()));
		System.out.println("***********************CART***********************\r\n"
				+ "Ordered Items:");	
		for(int i = 0; i < sorted.size();i+=1) {
			System.out.println(sorted.get(i));
				}
		System.out.println("Total cost: ["+totalCost()+"]\r\n"
				+ "***************************************************");
	}
	
}
