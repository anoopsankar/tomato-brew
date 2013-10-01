package in.rusty.tomatobrew;

import in.rusty.tomatobrew.models.Movie;

import java.io.IOException;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TomatoBrew {

    private HashMap<String, String> parameters = new HashMap<String, String>();

    public TomatoBrew(String apiKey) {
        parameters.put("apikey", apiKey);
    }

    public Movie[] search(final String query) throws TomatoException {

        parameters.put("q", query);

        String rawJson = "";
        try {
            rawJson = WebUtils.doGet(Constants.API_SEARCH, parameters);
        } catch (IOException e) {
            throw new TomatoException(e);
        }

        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(rawJson);
        JsonArray moviesArray = json.getAsJsonArray("movies");

        Movie[] movies = new Gson().fromJson(moviesArray, Movie[].class);
        return movies;
    }

    public Movie getMovie(String id) throws TomatoException {

        String json;
        try {
            json = WebUtils.doGet(Constants.API_MOVIE + id + ".json", parameters);
        } catch (IOException e) {
            throw new TomatoException(e);
        }
        Gson gson = new Gson();
        Movie movie = gson.fromJson(json, Movie.class);

        return movie;
    }

    public static void main(String[] args) throws TomatoException {
       // Example
       Movie[] movies = new TomatoBrew("vh7emb6rnckmca2gaevmbxx8").search("jigkdfdkdfd");
       
    }
    
}
