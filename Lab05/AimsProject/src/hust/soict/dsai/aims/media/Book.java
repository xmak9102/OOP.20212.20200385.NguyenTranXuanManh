package hust.soict.dsai.aims.media;

import java.util.*;


public class Book extends Media{

	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	
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
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> name) {
		this.authors = name;
	}
	
	
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Author already got!");
		}
		else {
			authors.add(authorName);
		}
	}
	
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			int t = authors.indexOf(authorName);
			authors.remove(t);
			}
		else {
			System.out.println("No such author exist!");
			}
		}
		
		
	public Book(int id,String title,String category,float cost) {
		super(id,title,category,cost);
		}
		
	
}
