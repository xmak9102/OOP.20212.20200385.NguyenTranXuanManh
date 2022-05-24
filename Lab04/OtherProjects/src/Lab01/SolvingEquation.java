package Lab01;
import javax.swing.JOptionPane;

public class SolvingEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] responses = {"Linear equation", "Linear system","Cancel"};
		
		int choice = JOptionPane.showOptionDialog(null,
				"Choose your option",
				"Caculator",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				responses,
				0);
		
		if (choice == 0) {
			String a1 = JOptionPane.showInputDialog("Enter a in ax + b = 0");
			String b1 = JOptionPane.showInputDialog("Enter b in ax + b = 0");
			
			int a = Integer.parseInt(a1);
			int b = Integer.parseInt(b1);
			if(a == 0 && b!=0) {
				JOptionPane.showMessageDialog(null, "No answer");
			}
			else if(a==0 && b== 0) {
				JOptionPane.showMessageDialog(null, "Infinite!");
			}
			else {
				float ans = -b/a;
				JOptionPane.showMessageDialog(null, "Your answer is: "+ans);
				
				}
		}
		else if(choice == 1) {
			String a11t = JOptionPane.showInputDialog("Solving a11x1+a12x2 = b1\n          & a21x1+a22x2 = b2 \n Enter a11");
			int a11 = Integer.parseInt(a11t);
			String a12t = JOptionPane.showInputDialog("Solving a11x1+a12x2 = b1\n          & a21x1+a22x2 = b2 \n Enter a12");
			int a12 = Integer.parseInt(a12t);
			String b1t = JOptionPane.showInputDialog("Solving a11x1+a12x2 = b1\n          & a21x1+a22x2 = b2 \n Enter b1");
			int b1 = Integer.parseInt(b1t);
			
			String a21t = JOptionPane.showInputDialog("Solving a11x1+a12x2 = b1\n          & a21x1+a22x2 = b2 \n Enter a21");
			int a21 = Integer.parseInt(a21t);
			String a22t = JOptionPane.showInputDialog("Solving a11x1+a12x2 = b1\n          & a21x1+a22x2 = b2 \n Enter a22");
			int a22 = Integer.parseInt(a22t);
			String b2t = JOptionPane.showInputDialog("Solving a11x1+a12x2 = b1\n          & a21x1+a22x2 = b2 \n Enter b2");
			int b2 = Integer.parseInt(b2t);
			
			
			if(a11 ==0 && a12 ==0 && b1==0 && a21 ==0 && a22== 0 && b2 == 0 ) {
				JOptionPane.showMessageDialog(null,"Infinite!");
			}
			else if(a11 == 0 && a12== 0 && b1!=0 || a21 == 0 && a22== 0 && b2!=0 ) {
				JOptionPane.showMessageDialog(null,"No awnser");
			}
			else {
				float ans1 = (b1*a21 - b2*a11)/(a12*a21 -a22*a11);
				float ans2 = (b1*a22 - b2*a11)/(-a12*a21 +a22*a11);
				JOptionPane.showMessageDialog(null,"X1 is: "+ans1+" and X2 is: "+ans2);			
				}
		}
		else {
			JOptionPane.showMessageDialog(null,"You cancel it");
		}
	}

}

