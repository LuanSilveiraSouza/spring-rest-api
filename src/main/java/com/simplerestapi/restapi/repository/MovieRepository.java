package com.simplerestapi.restapi.repository;

import com.simplerestapi.restapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByNameContainingIgnoreCase(final String name);

}
