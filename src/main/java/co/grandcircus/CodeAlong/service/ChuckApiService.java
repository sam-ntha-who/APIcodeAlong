package co.grandcircus.CodeAlong.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.CodeAlong.model.ChuckResponse;
import co.grandcircus.CodeAlong.model.JokeValue;

@Service
public class ChuckApiService {
	// called rest template bc of rest api
	
	private RestTemplate request = new RestTemplate();
	
	//incl a param to get multiple random jokes
	public List<JokeValue> getRandomJokes(int number) {
		String url = "http://api.icndb.com/jokes/random/{0}";
		ChuckResponse response = request.getForObject(url, ChuckResponse.class, number);
		return response.getJokeValues();
	}
	
}
