package hust.soict.dsai.test;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.screen.customer.controller.ViewStoreController;
import hust.soict.dsai.aims.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application {
	private static Store store;
	private static Cart cart;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		final String STORE_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Store.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		ViewStoreController viewStoreController = new ViewStoreController(store,cart);
		fxmlLoader.setController(viewStoreController);
		Parent root = fxmlLoader.load();
		
		primaryStage.setTitle("Store");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		store = new Store();
		cart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1,"The Alchemist", "Novel", "Paulo Coelho", 10.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(2,"The Untethered soul", "Story", "Michael A.Singer", 14.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(3,"Canslim", "Document", "Matthew Galgani", 18.95f);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc(1,"Lion King", "Animation", "RogerAllers", 87, 19.95f);
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc(2,"Star Wars", "Science Fiction", null, 24.99f);
		
		DigitalVideoDisc dvd6 = new DigitalVideoDisc(3,"Aladin", "Animation", null, 45, 18.99f);
		
	
		store.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6);
		launch(args);
	}
}
