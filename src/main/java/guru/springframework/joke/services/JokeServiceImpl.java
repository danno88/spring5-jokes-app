package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    /* Final: this is created once in Contrstuctor when Spring fist creates the class, but because final not created again for each request!
        Best practice!
     */
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        //TODO: why not using Autoinject dependency in this case (by adding it to contructor as param)?
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
