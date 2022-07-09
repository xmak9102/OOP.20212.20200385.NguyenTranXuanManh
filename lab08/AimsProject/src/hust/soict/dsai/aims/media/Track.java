package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import hust.soict.dsai.aims.exception.PlayerException;

public class Track implements Playable,Comparable{
	
	private String title;
	private int length;
	private int id;
	private String category;
	private float cost;
	public static int total_length;
	
	public ArrayList<Track> tracks = null;
	
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
	
	
	public Boolean equals(Track track) {
		if(this.getTitle() == track.getTitle() && this.getLength() ==track.getLength()) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void play() throws PlayerException{
		/*System.out.println("Playing track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());*/
		
		if(this.getLength() > 0) {
			
			Iterator iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				}catch(PlayerException e) {
					throw e;
				}
			}
		}
	}
	

}
