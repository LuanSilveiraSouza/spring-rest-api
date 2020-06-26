package com.simplerestapi.restapi.services;

import com.simplerestapi.restapi.exception.MovieNotFoundException;
import com.simplerestapi.restapi.model.Movie;
import com.simplerestapi.restapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

    public List<Movie> findAll() {
        System.out.println(movieRepo.findAll());
        return movieRepo.findAll();
    }

    public Movie findById(final Long id) {
        final Optional<Movie> movie = movieRepo.findById(id);

        if (movie.isPresent()) {
            return movie.get();
        } else {
            throw new MovieNotFoundException();
        }

    }

    public Movie create(final Movie movie) {
        return movieRepo.save(movie);
    }
}
