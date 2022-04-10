//package helloword;
import java.util.Scanner;
public class solveEquation {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("linear equation enter 1 and linear system enter 2 :");
		System.out.println("Enter number : ");
		int iNumber = keyboard.nextInt();
		switch(iNumber) {
		case 1:
			System.out.println("Solve : ax +b =0 ");
			System.out.println("Enter a : ");
			float a = keyboard.nextFloat();
			System.out.println("Enter b : ");
			float b = keyboard.nextFloat();
			if(a == 0 && b!=0) {
				System.out.println("No awnser ");
			}else if(a==0 && b== 0) {
				System.out.println("Wealth of counter");
			}else {
				float fAwnser = -b/a;
				System.out.println("Awnser:" );
				System.out.println(fAwnser);
			}
		case 2:
			System.out.println("Solve : a11x1 +a12x2 =b1 & a21x1+a22x2 =2 ");
			System.out.println("Enter a11 : ");
			float a11 = keyboard.nextFloat();
			System.out.println("Enter a12 : ");
			float a12 = keyboard.nextFloat();
			System.out.println("Enter b1 : ");
			float b1 = keyboard.nextFloat();
			System.out.println("Enter a21 : ");
			float a21 = keyboard.nextFloat();
			System.out.println("Enter a22 : ");
			float a22 = keyboard.nextFloat();
			System.out.println("Enter b2 : ");
			float b2= keyboard.nextFloat();
			if(a11 ==0 && a12 ==0 && b1==0 && a21 ==0 && a22== 0 && b2 == 0 ) {
				System.out.println("Wealth of counter");
			}else if(a11 == 0 && a12== 0 && b1!=0 || a21 == 0 && a22== 0 && b2!=0 ) {
				System.out.println("No awnser ");
			}else {
				float fAwnserx1 = (b1*a21 - b2*a11)/(a12*a21 -a22*a11);
				System.out.println("Awnser x1:" );
				System.out.println(fAwnserx1);
				float fAwnserx2 = (b1*a22 - b2*a11)/(-a12*a21 +a22*a11);
				System.out.println("Awnser x2:" );
				System.out.println(fAwnserx2);
			}
		}
	}
}
