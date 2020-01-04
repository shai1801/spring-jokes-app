package springframework.guru.springjokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
public class GetJokeServiceImpl implements GetJokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public GetJokeServiceImpl() {
		super();
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJokes() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}
	
	
	

}
