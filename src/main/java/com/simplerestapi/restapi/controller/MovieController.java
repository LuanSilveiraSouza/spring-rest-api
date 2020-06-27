package com.simplerestapi.restapi.controller;

import com.simplerestapi.restapi.model.Movie;
import com.simplerestapi.restapi.repository.MovieRepository;
import com.simplerestapi.restapi.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/movies")
    public List getMovies() {
        return movieService.findAll();
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable("id") Long id) {
        final Movie movie = movieService.findById(id);

        return ResponseEntity.ok(movie);
    }

    @PostMapping("/movie")
    @ResponseStatus(HttpStatus.CREATED)
    public String createMovie(@Valid @RequestBody Movie movie) {
        try {
            movieService.create(movie);
            return "Filme adicionado com sucesso";
        } catch(Exception e) {
            return "Erro!!!";
        }
    }
}
