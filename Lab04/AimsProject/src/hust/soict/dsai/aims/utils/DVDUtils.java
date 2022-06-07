package hust.soict.dsai.aims.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class DVDUtils {
	

	public static Boolean compareByCost(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		return o1.getCost() == o2.getCost();
	}
	
	public static Boolean compareByTitle(DigitalVideoDisc o1, DigitalVideoDisc o2) {
		return o1.getTitle() == o2.getTitle();
		
	}
	
	public static List<DigitalVideoDisc> Sort_by_cost(DigitalVideoDisc ... disc ) {
		List<DigitalVideoDisc> arl = new ArrayList<>();
		for(int i = 0; i<disc.length;i++){
			arl.add(disc[i]);
				}
		Collections.sort(arl, (o1,o2) -> Float.compare(o1.getCost(), o2.getCost()));
		return arl;
	}
	
	public static List<DigitalVideoDisc> Sort_by_title(DigitalVideoDisc ... disc ) {
		List<DigitalVideoDisc> arl = new ArrayList<>();
		for(int i = 0; i<disc.length;i++){
			arl.add(disc[i]);
				}
		//Collections.sort(arl, Comparator.comparing(e -> ((DigitalVideoDisc)e).getTitle()));
		
		arl.sort(Comparator.comparing(e -> ((DigitalVideoDisc)e).getTitle()));
		
		return arl;
						
	}
	
}
