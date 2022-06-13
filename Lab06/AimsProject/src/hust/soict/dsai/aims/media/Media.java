package hust.soict.dsai.aims.media;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;

import hust.soict.dsai.aims.utils.MediaComparatorByCostTitle;
import hust.soict.dsai.aims.utils.MediaComparatorByTitleCost;

public abstract class Media implements Comparable<Media>{

	private int id;
	private String title;
	private String category;
	private float cost;
	private Date date_add;
	public static int nb_of_media;
	
	
	
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Integer getNb_of_media() {
		return nb_of_media;
	}
	public void setNb_of_media(Integer nb_of_media) {
		this.nb_of_media = nb_of_media;
	}
	public Date getDate_add() {
		return date_add;
	}
	public void setDate_add(Date date_add) {
		this.date_add = date_add;
	}


	public Media(int id, String title, String category, float cost,Date date_add) {
		nb_of_media += 1;
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.date_add = date_add;
		}
	
	public Media(int id, String title, String category, float cost) {
		nb_of_media += 1;
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		}
	
	public Boolean isMatch(String title) {	
		String dvd = new String(this.getTitle());
		if(dvd.toLowerCase().indexOf(title.toLowerCase()) == -1) {
			return false;
			}
		else {return true;}
		}
	
	public boolean equals(Media media) {
		if (this.getId() == media.getId()) {
			return true;
			}
		else {
			return false;
			}
		}
	
	@Override
	public int compareTo(Media media) {
		if(this.getTitle() == media.getTitle()) {
			return this.getCost() < media.getCost() ? 1:-1;
				}
		else {
			return this.getTitle().compareTo(media.getTitle());
			}
		}
	
	
	public static final Comparator<Media> By_title_cost = 
			new MediaComparatorByTitleCost();
	
	public static final Comparator<Media> By_cost_title = 
			new MediaComparatorByCostTitle();
	
	@Override
	public String toString() {
		return ("[" + this.getId() +"] - ["+ this.getTitle()+"] - ["+ this.getCategory() +"]: ["+ this.getCost()+"]$");
		}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
}
	
	


