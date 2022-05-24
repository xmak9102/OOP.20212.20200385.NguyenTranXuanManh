package hust.soict.dsai.garbage;
import java.io.File;  
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner; 

public class ConcatenationInLoops {
	public static void main(String[] args) {

	Random r = new Random(123);
	long start = System.currentTimeMillis();
	
	String s = "";
	for (int i = 0;i<65536;i++){
		s += r.nextInt(2);
	}
	System.out.println("Time: "+(System.currentTimeMillis() - start)+" ms");

	
	//-----
	r = new Random(123);
	start = System.currentTimeMillis();
	
	StringBuilder sb1 = new StringBuilder();
	for (int i = 0;i<65536;i++){
		sb1.append(r.nextInt(2));
	}
	s = sb1.toString();
	System.out.println("Time StringBuilder: "+(System.currentTimeMillis() - start)+" ms");
	
	
	//--------------
	StringBuffer sb2 = new StringBuffer();
	for (int i = 0;i<65536;i++){
		sb2.append("hust");
	}
	System.out.println("Time StringBuffer: "+(System.currentTimeMillis() - start)+" ms");

	}
	
	/* 
	 * >>>out:  Time: 788 ms
				Time StringBuilder: 1 ms
				Time StringBuffer: 3 ms
	*/
	
}


