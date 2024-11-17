package com.example.myMovies.dataAccess;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myMovies.entities.Casts;

public interface  CastRepository extends JpaRepository<Casts, Integer> {
    List<Casts> findAllByMovieId(int id);
}
