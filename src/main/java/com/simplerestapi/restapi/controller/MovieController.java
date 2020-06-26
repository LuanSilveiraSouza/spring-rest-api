package com.simplerestapi.restapi.controller;

import com.simplerestapi.restapi.model.Movie;
import com.simplerestapi.restapi.repository.MovieRepository;
import com.simplerestapi.restapi.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Movie getMovie(@PathVariable("id") Long id) {

        return movieService.findById(id);
    }

    @PostMapping("/movie")
    public String createMovie(@Valid @RequestBody Movie movie) {
        try {
            movieService.create(movie);
            return "Filme adicionado com sucesso";
        } catch(Exception e) {
            return "Erro!!!";
        }
    }
}
