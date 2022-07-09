package hust.soict.dsai.aims.media;

import java.io.IOException;

import hust.soict.dsai.aims.exception.PlayerException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DigitalVideoDisc extends Media implements Playable{
	
	
	private int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	
	//---------//
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
	
	
	
	public DigitalVideoDisc(int id,String title, String category, String director, int length, float cost) {
		super(id, title, category, cost);
		nb_of_media += 1;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = id;
		
		
	}
	public DigitalVideoDisc(int id,String title, String category, String director, float cost) {
		super(id, title, category, cost);
		nb_of_media += 1;
		this.title = title;
		this.id = id;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(int id,String title, String category,int length, float cost) {
		super(id, title, category, cost);
		nb_of_media += 1;
		this.title = title;
		this.category = category;
		this.length = length;
		this.cost = cost;
		this.id = id;
		}
	public DigitalVideoDisc(int id,String title, String category, float cost) {
		super(id, title, category, cost);
		nb_of_media += 1;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = id;
		}

	
	public Boolean isMatch(String title) {
		
		String dvd = new String(this.getTitle());
		if(dvd.toLowerCase().indexOf(title.toLowerCase()) == -1) {
			return false;
			}
		else {return true;}
		}
	
	@Override
	public String toString() {
		return ("DVD - [" + this.getId() +"] - ["+ this.getTitle()+"] - ["+ this.getCategory() +"] - ["+ this.getDirector() 
		+"] - ["+ this.getLength()+"]: ["+ this.getCost()+"]$");
		}
	
	@Override
	public void play() throws PlayerException{
		if (this.getLength() > 0) {
			try {
	    		final String PLAY_FXML_FILE_PATH = "/hust/soict/dsai/aims/screen/customer/view/Play.fxml";
	    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PLAY_FXML_FILE_PATH));
	    		Parent root = fxmlLoader.load();
	    		Stage stage = new Stage();
	    		stage.setTitle("Play");
	    		stage.setScene(new Scene(root));
	    		stage.show();		
	    	}
	    	catch (IOException e) {
	    		e.printStackTrace();
	    	}
		}
		else {
			System.out.println("ERROR: DVD length is non-positive!");
		}
	}
	
}

