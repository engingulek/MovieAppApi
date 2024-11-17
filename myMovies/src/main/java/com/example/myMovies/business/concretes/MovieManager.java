package com.example.myMovies.business.concretes;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myMovies.business.abstracts.MovieService;
import com.example.myMovies.core.mappers.ModelMapperService;
import com.example.myMovies.core.response.MovieDetailResponse;
import com.example.myMovies.core.response.MovieResponse;
import com.example.myMovies.dataAccess.MovieRepository;
import com.example.myMovies.entities.Movie;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class MovieManager implements  MovieService  {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ModelMapperService modelMapperService;

    @Override
    public List<MovieResponse> getMovieResponses(String text) {
        List<Movie> movies = movieRepository.findAll();
        List<MovieResponse> movieResponses = movies.stream()
        .map(movie -> modelMapperService.forResponse().map(movie, MovieResponse.class))
        .collect(Collectors.toList());

       List<MovieResponse> filterList = movieResponses.stream().filter(item -> item.getName().toLowerCase().contains(text.toLowerCase()))
        .collect(Collectors.toList());
        return  filterList;
    }

    @Override
    public List<MovieResponse> getAll() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieResponse> movieResponses = movies.stream()
        .map(movie -> modelMapperService.forResponse().map(movie, MovieResponse.class))
        .collect(Collectors.toList());
        return  movieResponses;
    }

    @Override
    public MovieDetailResponse findById(int id) {
        MovieDetailResponse movieResponse = modelMapperService.forResponse()
        .map(movieRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Movie not found with id: " + id)), 
             MovieDetailResponse.class);


        return  movieResponse;
    }

  
    
}
