package hust.soict.dsai.aims.media;

import java.util.Date;

public class Disc extends Media{
	
	private int id;
	private String title;
	private String category;
	private float cost;
	private int lenght;
	private String director;
	

	public Disc(int id, String title, String category, float cost) {
		super(id,title, category, cost);
	}
	
	
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	

	
}
