package hust.soict.dsai.aims.screen.manager;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

import hust.soict.dsai.aims.MediaStore;
import hust.soict.dsai.aims.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;


public class Update_store extends JFrame implements ActionListener{
	
	JMenuItem view_button;
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		
		view_button = new JMenuItem("View store");
		menu.add(view_button);
		
		JMenu smUpdateStore = new JMenu("Update Store");
		
		
		smUpdateStore.add(new JMenuItem("Add DVD"));
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		menu.add(smUpdateStore);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	public Update_store() {
		//Container cp = getContentPane();
		this.add(createMenuBar());
		this.setLayout(new BorderLayout());
		this.setTitle("Update");
		this.setSize(1024, 768);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view_button) {
			this.dispose();
			new StoreManagerScreen(new Store());
		}
		
	}
}
