package com.codecool.backenddemo.data;

import com.codecool.backenddemo.model.Movie;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository {

    private Collection<Movie> testMovies;

    public MovieRepository() {
        this.testMovies = List.of(new Movie(1, "Vier Fäuste für eine Hallejulia", Instant.now(), new LinkedList<>()),
                new Movie(2, "Die Piefkasage 5", Instant.now(), new LinkedList<>()));
    }

    public Optional<Movie> getMovieById(int id) {
        return testMovies.stream().filter(movie -> movie.getId() == id).findFirst();
    }

    public Collection<Movie> getAllMovies() {
        return this.testMovies;
    }
}
