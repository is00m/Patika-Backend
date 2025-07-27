package MovieAndCollectionFiltering;

public class Movie {
    String title;
    int year;
    String genre;
    double imdbRating;


    public Movie(String title, int year, String genre, double imdbRating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.imdbRating = imdbRating;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }
}
