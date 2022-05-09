package Lab03;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "RogerAllers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		
		
		anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3);
			
		anOrder.removeDigitalVideoDisc(dvd2);
		
		Float totalCost = (float) 0.0;
		for (int i = 0; i<anOrder.arl.size();i++) {
			totalCost += anOrder.arl.get(i).getCost();
		}

		System.out.print("Total cost is: ");
		System.out.println(Math.round(totalCost * 100.0) / 100.0);
		
		System.out.print("Total disc: ");
		System.out.println(anOrder.qtyOrdered());		
	}

}
