package in.rusty.tomatobrew.models;

import java.util.HashMap;

public class Movie {
    private String id;
    private String title;
    private String year;
    private String mpaa_rating;
    private String runtime;
    private String critics_consensus;
    private String synopsis;
    private String[] genre;
    private String studio;
    private Cast[] abridged_cast;
    private Cast[] abridged_directors;

    private Rating ratings;

    private HashMap<String, String> links;
    private HashMap<String, String> posters;
    private HashMap<String, String> release_dates;
    private HashMap<String, String> alternate_ids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMpaa_rating() {
        return mpaa_rating;
    }

    public void setMpaa_rating(String mpaa_rating) {
        this.mpaa_rating = mpaa_rating;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getCritics_consensus() {
        return critics_consensus;
    }

    public void setCritics_consensus(String critics_consensus) {
        this.critics_consensus = critics_consensus;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public HashMap<String, String> getLinks() {
        return links;
    }

    public void setLinks(HashMap<String, String> links) {
        this.links = links;
    }

    public Rating getRating() {
        return ratings;
    }

    public void setRating(Rating rating) {
        this.ratings = rating;
    }

    public HashMap<String, String> getPosters() {
        return posters;
    }

    public void setPosters(HashMap<String, String> posters) {
        this.posters = posters;
    }

    public HashMap<String, String> getRelease_dates() {
        return release_dates;
    }

    public void setRelease_dates(HashMap<String, String> release_dates) {
        this.release_dates = release_dates;
    }

    public HashMap<String, String> getAlternate_ids() {
        return alternate_ids;
    }

    public void setAlternate_ids(HashMap<String, String> alternate_ids) {
        this.alternate_ids = alternate_ids;
    }



    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Cast[] getAbridged_cast() {
        return abridged_cast;
    }

    public void setAbridged_cast(Cast[] abridged_cast) {
        this.abridged_cast = abridged_cast;
    }

    public Cast[] getAbridged_directors() {
        return abridged_directors;
    }

    public void setAbridged_directors(Cast[] abridged_directors) {
        this.abridged_directors = abridged_directors;
    }

    public Rating getRatings() {
        return ratings;
    }

    public void setRatings(Rating ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie : \"" + title + "\"";  
    }

    class Rating {
        private String critics_rating;
        private String critics_score;
        private String audience_rating;
        private String audience_score;

        public String getCritics_rating() {
            return critics_rating;
        }

        public void setCritics_rating(String critics_rating) {
            this.critics_rating = critics_rating;
        }

        public String getCritics_score() {
            return critics_score;
        }

        public void setCritics_score(String critics_score) {
            this.critics_score = critics_score;
        }

        public String getAudience_rating() {
            return audience_rating;
        }

        public void setAudience_rating(String audience_rating) {
            this.audience_rating = audience_rating;
        }

        public String getAudience_score() {
            return audience_score;
        }

        public void setAudience_score(String audience_score) {
            this.audience_score = audience_score;
        }
    }

}
