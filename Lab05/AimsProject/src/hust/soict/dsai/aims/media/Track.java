package hust.soict.dsai.aims.media;

import java.util.Date;

public class Track implements Playable{
	
	private String title;
	private int length;
	private int id;
	private String category;
	private float cost;
	public static int total_length;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLenght(int length) {
		this.length = length;
	}


	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
		total_length += this.getLength();
	}
	@Override
	public void play() {
		System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());		
	}
	

}
