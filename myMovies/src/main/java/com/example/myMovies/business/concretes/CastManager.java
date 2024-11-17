package com.example.myMovies.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myMovies.business.abstracts.CastService;
import com.example.myMovies.core.mappers.ModelMapperService;
import com.example.myMovies.core.response.CastResponse;
import com.example.myMovies.dataAccess.CastRepository;
import com.example.myMovies.entities.Casts;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CastManager implements CastService {
    @Autowired
    private CastRepository castRepository;
    @Autowired
     private ModelMapperService modelMapperService;
    @Override
    public List<CastResponse> getCastResponses(int id) {
        List<Casts> casts = castRepository.findAllByMovieId(id);
        List<CastResponse> castResponses = casts.stream()
        .map(cast -> modelMapperService.forResponse().map(cast, CastResponse.class))
        .collect(Collectors.toList());
        return  castResponses;
    }
    
}
