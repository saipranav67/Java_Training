package Day6.assignment3;


import java.time.LocalDate;
import java.util.*;

public class MovieService {

    // 1. Create a list of movies
    public List<Movie> createMovieSet() {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Inception", "English", LocalDate.of(2010, 7, 16), "Christopher Nolan", "Emma Thomas", 2.8));
        movieList.add(new Movie("Interstellar", "English", LocalDate.of(2014, 11, 7), "Christopher Nolan", "Emma Thomas", 2.9));
        movieList.add(new Movie("Parasite", "Korean", LocalDate.of(2019, 5, 30), "Bong Joon-ho", "Kwak Sin-ae", 2.1));
        movieList.add(new Movie("Dangal", "Hindi", LocalDate.of(2016, 12, 23), "Nitesh Tiwari", "Aamir Khan", 2.5));
        movieList.add(new Movie("Your Name", "Japanese", LocalDate.of(2016, 8, 26), "Makoto Shinkai", "Kōichirō Itō", 1.8));
        movieList.add(new Movie("The Godfather", "English", LocalDate.of(1972, 3, 24), "Francis Ford Coppola", "Albert S. Ruddy", 2.9));
        return movieList;
    }

    // 2. Sort movies by language (Comparable)
    public void sortByLanguage(List<Movie> movieList) {
        Collections.sort(movieList);
    }

    // 3. Sort movies by director (Comparator)
    public void sortByDirector(List<Movie> movieList) {
        movieList.sort(Comparator.comparing(Movie::getDirector));
    }

    // 4. Sort movies by duration (Comparator)
    public void sortByDuration(List<Movie> movieList) {
        movieList.sort(Comparator.comparingDouble(Movie::getDuration));
    }
}

