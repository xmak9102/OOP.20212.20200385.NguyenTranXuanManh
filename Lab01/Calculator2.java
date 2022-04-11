import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "Sum of 2 numbers: ";
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double sum = num1 + num2;
		double difference = Math.abs(num1 - num2);
		double product = num1*num2;
		double quo = num1/num2;
		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(quo);
		System.exit(0);

	}
}
