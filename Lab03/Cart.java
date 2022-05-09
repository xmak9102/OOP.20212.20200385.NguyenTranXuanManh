import java.util.ArrayList;

public class Cart{
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	ArrayList<DigitalVideoDisc> arl = new ArrayList<DigitalVideoDisc>();
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc ... discs ) {
		if (arl.size() + discs.length <= MAX_NUMBERS_ORDERED) {
		for(int i = 0; i<discs.length;i++)
			{arl.add(discs[i]);}
		System.out.println("The discs has been added");
			}
		
		else {System.out.println("The cart is almost full");}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc ... discs) {
		try {
		for(int i = 0; i<discs.length;i++) {
			DigitalVideoDisc name = discs[i];
			int t = arl.indexOf(name);
			arl.remove(t);}	
		}
		catch(Exception e) 
		{System.out.println("Something went wrong");}
	}
	
	public int qtyOrdered() {
		return arl.size();}
	
	}
