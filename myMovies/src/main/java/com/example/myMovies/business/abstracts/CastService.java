package com.example.myMovies.business.abstracts;

import java.util.List;

import com.example.myMovies.core.response.CastResponse;

public interface  CastService {
    List<CastResponse> getCastResponses(int id);
}
