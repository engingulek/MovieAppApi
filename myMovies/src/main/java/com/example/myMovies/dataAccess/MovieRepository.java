package com.example.myMovies.dataAccess;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myMovies.entities.Movie;

public interface  MovieRepository extends JpaRepository<Movie,Integer> {
    
}
