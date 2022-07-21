package co.grandcircus.CodeAlong.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

//outermost
public class ChuckResponse {
	private String type;
	
	@JsonProperty("value")
	private List<JokeValue> jokeValues;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<JokeValue> getJokeValues() {
		return jokeValues;
	}
	public void setJokeValues(List<JokeValue> jokeValues) {
		this.jokeValues = jokeValues;
	}
	
	
}
