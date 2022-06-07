package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Date;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	static ArrayList<Track> Track_array = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getLenght() {
		return this.getLenght();	
	}
	
	
	public CompactDisc(int id, String title, String category, float cost, Date date_add) {
		super(id, title, category, cost);
	}
	public CompactDisc(int id, String title, String category, float cost) {
		super(id, title, category, cost);
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
}
