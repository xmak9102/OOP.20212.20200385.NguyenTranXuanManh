package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Date;

public class CompactDisc extends Media implements Playable{

	private int id;
	private String title;
	private String category;
	private String artist;
	private String director;
	private int length;
	private float cost;
	public static int nbCD;
	static ArrayList<Track> Track_array = new ArrayList<Track>();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String diretor) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
	public CompactDisc(int id, String title, String category,String artist,String director,int length, float cost) {
		super(id, title, category, cost);
		this.id = id;
		this.title = title;
		this.category = category;
		this.artist = artist;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public void addTrack(Track track) {
		if (Track_array.contains(track)) {
			System.out.println("Track exists!");
		}
		else {
			Track_array.add(track);
		}
	}
	
	public void removeTrack(Track track) {	
		if (Track_array.contains(track)) {
			int t = Track_array.indexOf(track);
			Track_array.remove(t);
		}
		else {
			System.out.println("No such track exist!");
		}	
	}
	
	
	@Override
	public void play() {
		System.out.println("Compact disc: "+getId()+" "+getTitle()+" "+getCategory() );
		for (Track i:Track_array) {
			i.play();
		}
	}
	
	@Override
	public String toString() {
		return ("CD - [" + this.getId() +"] - ["+ this.getTitle()+"] - ["+ this.getCategory()+"] - ["+ this.getArtist() +"] - ["+ this.getDirector() 
		+"] - ["+ this.getLength()+"]: ["+ this.getCost()+"]$");
		}
	
}
