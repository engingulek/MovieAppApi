package com.example.myMovies.dataAccess;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myMovies.entities.Category;

public interface  CategoryRepository extends JpaRepository<Category, Integer> {
    
}
