import java.util.Scanner;

public class Display_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        int d = 0;
        
        System.out.print("Enter year: ");
        int y = scanner.nextInt();
        
        System.out.print("Enter month: ");
        int m = scanner.nextInt();
        
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
    		d = 31;
    	}
	    else if(m == 4 || m == 6 || m == 9 || m == 11) {
		    d = 30;	  
	    }
	    else if(m == 2) {
		    if(y%400 == 0 && y%100 == 0) {
			    d = 29;
		    }
		    else if(y%4 == 0 && y%100 != 0) {
			    d = 29;
		    }
		    else {
			    d = 28;
		   }
		}
	    System.out.printf("Number of days in %d/%d is: %d", m, y, d);
	    
        scanner.close();
		System.exit(0);

	}
}
