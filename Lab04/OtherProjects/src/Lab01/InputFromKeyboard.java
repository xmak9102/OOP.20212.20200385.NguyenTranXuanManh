package Lab01;
import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String strName = keyb.nextLine();
		
		System.out.println("How old are you?");
		int age = keyb.nextInt();
		
		System.out.println("How tall are you (m)?");
		double height = keyb.nextDouble();
		
		System.out.println("Mrs/Ms. " + strName + ", " + age + 
				" years old. " + "Your height is " + height + ".");
	}

}
