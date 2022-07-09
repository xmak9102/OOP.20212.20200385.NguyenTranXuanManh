package hust.soict.dsai.aims.screen.manager;

import java.awt.*;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.*;

import hust.soict.dsai.aims.MediaStore;
import hust.soict.dsai.aims.Store;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;

public class StoreManagerScreen extends JFrame implements ActionListener{
	private Store store;
	

	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north,BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuItem add_dvd;
	JMenuItem add_book;
	JMenuItem add_cd;
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		menu.add(new JMenuItem("View store"));
		
		JMenu smUpdateStore = new JMenu("Update Store");
		
		add_dvd = new JMenuItem("Add DVD");
		add_book = new JMenuItem("Add Book");
		add_cd = new JMenuItem("Add CD");
		
		smUpdateStore.add(add_dvd);
		smUpdateStore.add(add_book);
		smUpdateStore.add(add_cd);
		menu.add(smUpdateStore);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(),Font.PLAIN, 50));
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for (int i = 0;i<mediaInStore.size();i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
        return center;
	}
	
	public StoreManagerScreen(Store store) {
		this.store = store;

		Container cp = getContentPane();
		
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setTitle("Store");
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()== add_dvd) {
			this.dispose();
			new Update_store();
		}
		if(e.getSource()== add_book) {
			this.dispose();
			new Update_store();
		}
		if(e.getSource()== add_cd) {
			this.dispose();
			new Update_store();
		}
	}
}
