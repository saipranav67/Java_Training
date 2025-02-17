package Day6.assignment3;

import java.time.LocalDate;

public class Movie implements Comparable<Movie> {
    private String name;
    private String language;
    private LocalDate releaseDate;
    private String director;
    private String producer;
    private double duration; // in hours

    public Movie(String name, String language, LocalDate releaseDate, String director, String producer, double duration) {
        this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public int compareTo(Movie other) {
        return this.language.compareTo(other.language); // Sorting by language
    }

    @Override
    public String toString() {
        return String.format("Movie{name='%s', language='%s', releaseDate=%s, director='%s', producer='%s', duration=%.2f hrs}",
                name, language, releaseDate, director, producer, duration);
    }
}
