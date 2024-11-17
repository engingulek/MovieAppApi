package com.example.myMovies.business.abstracts;

import java.util.List;

import com.example.myMovies.core.response.MovieDetailResponse;
import com.example.myMovies.core.response.MovieResponse;

public interface  MovieService {
    List<MovieResponse> getMovieResponses(String text);
    List<MovieResponse> getAll();
    MovieDetailResponse findById(int id);
 
}
