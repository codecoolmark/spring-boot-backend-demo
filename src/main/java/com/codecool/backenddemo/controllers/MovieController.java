package com.codecool.backenddemo.controllers;

import com.codecool.backenddemo.model.Movie;
import com.codecool.backenddemo.services.MovieServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
public class MovieController {

    private MovieServices moviesServices;

    public MovieController(MovieServices moviesServices) {
        this.moviesServices = moviesServices;
    }

    @GetMapping("/movies")
    public Collection<Movie> movies() {
        return this.moviesServices.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    public Optional<Movie> moviesId(@PathVariable int id) {
        return this.moviesServices.getMovieById(id);
    }
}
