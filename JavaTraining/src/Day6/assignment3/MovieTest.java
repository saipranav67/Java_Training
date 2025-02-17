package Day6.assignment3;


import java.util.List;

public class MovieTest {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        List<Movie> movies = movieService.createMovieSet();

        System.out.println("Original Movie List:");
        movies.forEach(System.out::println);

        movieService.sortByLanguage(movies);
        System.out.println("\nMovies Sorted by Language:");
        movies.forEach(System.out::println);

        movieService.sortByDirector(movies);
        System.out.println("\nMovies Sorted by Director:");
        movies.forEach(System.out::println);

        movieService.sortByDuration(movies);
        System.out.println("\nMovies Sorted by Duration:");
        movies.forEach(System.out::println);
    }
}

