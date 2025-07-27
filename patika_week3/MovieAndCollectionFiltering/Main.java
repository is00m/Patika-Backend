package MovieAndCollectionFiltering;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();

        //Filmlerimiz listemize ekliyoruz
        movieList.add(new Movie("The Shawshank Redemption", 1994, "Drama", 9.3));
        movieList.add(new Movie("The Godfather", 1972, "Crime", 9.2));
        movieList.add(new Movie("The Dark Knight", 2008, "Action", 9.1));
        movieList.add(new Movie("The Godfather Part II", 1974, "Crime", 9.0));
        movieList.add(new Movie("12 Angry Men", 1957, "Crime,Drama", 9.0));

        //IMDB puanına göre büyükten küçüğe sıralamamız
        movieList.sort(Comparator.comparingDouble(Movie::getImdbRating).reversed());
        System.out.println("---- KOLEKSİYONDAKİ FİLMLERİN IMDB PUANINA GÖRE SIRALAMASI ----");
        for (Movie movieImdb : movieList) {
            System.out.println(movieImdb.getTitle() + " - " + movieImdb.getImdbRating());
        }

        //Çıkış yılına göre küçükten büyüğe sıralamamız
        System.out.println("---- KOLEKSİYONDAKİ FİLMLERİN ÇIKIŞ YILINA GÖRE SIRALAMASI ----");
        movieList.sort(Comparator.comparingInt(Movie::getYear));
        for (Movie movieYear : movieList) {
            System.out.println(movieYear.getTitle() + " - " + movieYear.getYear());
        }

        //Kullanıcıdan veri alıp ekrana istediği türdeki filmleri yazdırıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Film türü giriniz(Drama,Crime,Action) : ");
        String wantedGenre = input.nextLine();
        filterByGenres(movieList, wantedGenre);
        input.close();

    }

    //Türüne göre filtreleme yapan metodumuz
    public static void filterByGenres(List<Movie> movieList, String genre) {
        for (Movie movie : movieList) {
            if (movie.getGenre().contains(genre)) {
                System.out.println(movie.getTitle() + " - " + movie.getGenre());
            }
        }
    }
}
