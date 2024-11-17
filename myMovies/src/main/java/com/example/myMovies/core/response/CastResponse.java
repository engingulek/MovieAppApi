package com.example.myMovies.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CastResponse {
    private int id;
    private String name;
    private String imageurl;
    private String rolename;

}
