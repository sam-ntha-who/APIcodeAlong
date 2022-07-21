package co.grandcircus.CodeAlong.model;

import java.util.List;

//start at innermost value to avoid errors
//no need for annotation for class
public class JokeValue {
	private int id;
	private String joke;
	private List<String> categories;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJoke() {
		return joke;
	}
	public void setJoke(String joke) {
		this.joke = joke;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	
	
	
}
