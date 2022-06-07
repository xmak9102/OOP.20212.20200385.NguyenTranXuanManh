package Lab01;
import java.util.Scanner;
public class Sort {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 for linear equation and 2 for linear system:");
		System.out.println("Enter number: ");
		int i = scanner.nextInt();
		if (i == 1) {
			System.out.println("Solve: ax + b = 0 ");
			System.out.println("Enter a: ");
			float a = scanner.nextFloat();
			System.out.println("Enter b: ");
			float b = scanner.nextFloat();
			if(a == 0 && b!=0) {
				System.out.println("No awnser");
			}
			else if(a==0 && b== 0) {
				System.out.println("Infinite!");
			}
			else {
				float ans = -b/a;
				System.out.println("Awnser:" );
				System.out.println(ans);
				}
		}
		else {
			System.out.println("Solve: a11x1+a12x2 = b1 & a21x1+a22x2 = b2 ");
			System.out.println("Enter a11: ");
			float a11 = scanner.nextFloat();
			System.out.println("Enter a12: ");
			float a12 = scanner.nextFloat();
			System.out.println("Enter b1: ");
			float b1 = scanner.nextFloat();
			System.out.println("Enter a21: ");
			float a21 = scanner.nextFloat();
			System.out.println("Enter a22: ");
			float a22 = scanner.nextFloat();
			System.out.println("Enter b2: ");
			float b2= scanner.nextFloat();
			if(a11 ==0 && a12 ==0 && b1==0 && a21 ==0 && a22== 0 && b2 == 0 ) {
				System.out.println("Infinite!");
			}
			else if(a11 == 0 && a12== 0 && b1!=0 || a21 == 0 && a22== 0 && b2!=0 ) {
				System.out.println("No awnser");
			}
			else {
				float ans1 = (b1*a21 - b2*a11)/(a12*a21 -a22*a11);
				System.out.printf("X1 is: %.2f\n", ans1);
				float ans2 = (b1*a22 - b2*a11)/(-a12*a21 +a22*a11);
				System.out.printf("X2 is: %.2f\n", ans2);			
				}
			}
		
	}
}
