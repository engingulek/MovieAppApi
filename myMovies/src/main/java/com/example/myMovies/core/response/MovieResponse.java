package com.example.myMovies.core.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieResponse {
    private int  id;
    private String imageUrl;
    private String name;
    private List<String> categories;
    private String info;

}
