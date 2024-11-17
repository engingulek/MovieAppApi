package com.example.myMovies.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name= "movies")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "imageurl")
    private String imageUrl;

    @Column(name = "name")
    private String name;

    @Column(name = "categories")
    private List<String> categories;

    @Column(name = "info")
    private String info;

    @Column(name = "director")
    private List<String> director;

    @Column(name = "writter")
    private List<String> writter;

    @Column(name = "detailimage")
    private String detailimage;

}
