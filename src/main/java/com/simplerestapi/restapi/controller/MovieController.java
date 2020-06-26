package com.simplerestapi.restapi.controller;

import com.simplerestapi.restapi.model.Movie;
import com.simplerestapi.restapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieRepository movieRepo;

    @GetMapping("/movies")
    public List getMovies() {
        return movieRepo.getAll();
    }

    @PostMapping("/movie")
    public String createMovie(@Valid @RequestBody Movie movie) {
        try {
            movieRepo.add(movie);
            return "Filme adicionado com sucesso";
        } catch(Exception e) {
            return "Erro!!!";
        }
    }
}
