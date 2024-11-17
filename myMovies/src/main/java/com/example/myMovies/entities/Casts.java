package com.example.myMovies.entities;

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

@Table(name= "casts")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Casts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_id")
    private int movieId;

    @Column(name = "imageurl")
    private String imageurl;

    @Column(name = "name")
    private String name;

    @Column(name = "rolename")
    private String rolename;
}


