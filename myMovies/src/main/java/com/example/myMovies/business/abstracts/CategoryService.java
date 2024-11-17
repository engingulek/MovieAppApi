package com.example.myMovies.business.abstracts;

import java.util.List;

import com.example.myMovies.core.response.CategoryResponse;

public interface CategoryService {
    List<CategoryResponse> getCategoryResponses();
}
