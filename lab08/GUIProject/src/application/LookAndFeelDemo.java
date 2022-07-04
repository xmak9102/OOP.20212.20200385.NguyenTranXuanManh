package application;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;

public class LookAndFeelDemo extends JFrame {
	
	public LookAndFeelDemo() {
		addDemoComponents();
		addLookAndFeelComboBox();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(380, 100);
		this.setVisible(true);
	}
	

	void addDemoComponents() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Label: "));
		cp.add(new JTextField("Text Field"));
		cp.add(new JRadioButton("Radio Button"));
		cp.add(new JButton("Button"));
	}
	
	void addLookAndFeelComboBox() {
		Container cp = getContentPane();
		cp.add(new JLabel("Change look and feel: "));
		
		String extend = UIManager.getCrossPlatformLookAndFeelClassName();		
		LookAndFeelInfo[] lafInfos = UIManager.getInstalledLookAndFeels();
		
		
		String[] lafNames = new String[lafInfos.length + 1];
		for (int i = 0; i < lafInfos.length; i += 1) {
			lafNames[i] = lafInfos[i].getName();
		}
		lafNames[lafInfos.length] = extend;
		
		JComboBox cbLookAndFeel = new JComboBox(lafNames);
		cp.add(cbLookAndFeel);
		
		JFrame frame = this;
		cbLookAndFeel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			 int index = cbLookAndFeel.getSelectedIndex();
			  if (index < lafInfos.length) {
				try {
					UIManager.setLookAndFeel(lafInfos[index].getClassName());
				}
				catch (Exception exp) {
					exp.printStackTrace();
				}
				SwingUtilities.updateComponentTreeUI(frame);
				setTitle(lafInfos[index].getName() + " Look and Feel");
				}
			  else {
				  try {
					UIManager.setLookAndFeel(extend);
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
						e1.printStackTrace();
					}
			  }
			}
		});
		
		
	};

}
