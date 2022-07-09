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
		
		
	public Book(int id,String title,String category,List<String> author, float cost) {
		super(id,title,category,cost);
		this.id = id;
		this.title = title;
		this.category = category;
		this.authors = author;
		this.cost = cost;
		
		}
	

	String content;

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		processContent(content);
		this.content = content;
	}
	
	static String[] contentTokens;
	int content_length = contentTokens.length;
	
	public static void processContent(String str) {
		contentTokens = str.split(" ");
	
		Map<String, Integer> wordFrequency = new TreeMap<>();
	
		for(int i=0;i<contentTokens.length;i++) {
			if(wordFrequency.containsKey(contentTokens[i])){
        	wordFrequency.put(contentTokens[i], wordFrequency.get(contentTokens)+1);
				}
			else {
        	wordFrequency.put(contentTokens[i],1);
				}
		}
    
		for(Map.Entry<String,Integer> entry:wordFrequency.entrySet()){
			System.out.println(entry.getKey()+" - "+entry.getValue());
				}
	}
	
	@Override
	public String toString() {
		return ("Book - [" + this.getId() +"] - ["+ this.getTitle()+"] - ["+ this.getCategory() +"] - ["+ this.getAuthors()+"]: ["+ this.getCost()+"]$"+"/n"
				 );
		}
		
}
