package com.codecool.backenddemo.services;

import com.codecool.backenddemo.data.MovieRepository;
import com.codecool.backenddemo.model.Movie;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class MovieServices {

    private MovieRepository movieRepository;

    public MovieServices(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> getAllMovies() {
        return this.movieRepository.getAllMovies();
    }

    public Optional<Movie> getMovieById(int id) {
        return this.movieRepository.getMovieById(id);
    }
}
