package com.example.myMovies.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myMovies.business.abstracts.MovieService;
import com.example.myMovies.core.response.MovieDetailResponse;
import com.example.myMovies.core.response.MovieResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("api/movie/")
@AllArgsConstructor
@NoArgsConstructor
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("searchMovie")
    public List<MovieResponse> searchMovie(@RequestParam String text){
        return  movieService.getMovieResponses(text);
    }

    @GetMapping("getAll")
    public List<MovieResponse> getAll() {
        return  movieService.getAll();
    }

    @GetMapping("movieDetail")
    public MovieDetailResponse getMovieDetail(@RequestParam int id){
        return  movieService.findById(id);
    }


    
}
