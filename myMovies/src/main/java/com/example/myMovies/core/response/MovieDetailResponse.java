package com.example.myMovies.core.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailResponse {
     private int  id;
    private String imageUrl;
    private String name;
    private List<String> categories;
    private String info;
    private List<String> director;
    private List<String> writter;
    private String detailimage;
}
