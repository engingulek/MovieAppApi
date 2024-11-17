package com.example.myMovies.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myMovies.business.abstracts.CategoryService;
import com.example.myMovies.core.response.CategoryResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("api/category/")
@AllArgsConstructor
@NoArgsConstructor
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("getAll")
    public List<CategoryResponse> getAll(){
        return categoryService.getCategoryResponses();
    }

}
