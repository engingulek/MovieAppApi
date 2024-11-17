package com.example.myMovies.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myMovies.business.abstracts.CastService;
import com.example.myMovies.core.response.CastResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("api/casts/")
@AllArgsConstructor
@NoArgsConstructor
public class CastController {
    @Autowired
    private CastService castService;

    @GetMapping("getAll")
    public List<CastResponse> getCast(@RequestParam int movieId) {
        return  castService.getCastResponses(movieId);
    }
}
