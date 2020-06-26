package com.simplerestapi.restapi.repository;

import com.simplerestapi.restapi.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private List<Movie> movies;

    public MovieRepository(){
        movies = new ArrayList<>();
        movies.add(new Movie("Jurassic Park", 1993));
        movies.add(new Movie("The Terminator", 1984));
        movies.add(new Movie("Indiana Jones", 1981));
    }

    public List<Movie> getAll() {
        return movies;
    }

    public void add(final Movie movie) {
        movies.add(movie);
    }
}
