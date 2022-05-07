//package Lab03;

import java.util.ArrayList;

public class Cart{
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	ArrayList<DigitalVideoDisc> arl = new ArrayList<DigitalVideoDisc>();
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc ... discs ) {
		for(int i = 0; i<discs.length;i++) {
			arl.add(discs[i]);}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc ... discs) {
		for(int i = 0; i<discs.length;i++) {
			DigitalVideoDisc name = discs[i];
			int t = arl.indexOf(name);
			arl.remove(t);}	
	}
	
	public int qtyOrdered() {
		return arl.size();}
	
	}
