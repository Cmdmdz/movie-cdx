package com.cdx.movieservice.repositories.dao.movies;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "movies")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Movies {

    @Id
    private String id;
    private String plot;
    private List<String> genres;
    private Integer runtime;
    private List<String> cast;
    private Integer num_mflix_comments;
    private String title;
    private String fullplot;
    private List<String> countries;
    @Field("released")
    private Date releaseDate;
    private List<String> directors;
    private String rated;
    private Awards awards;
    private String lastupdated;
    private String year;
    private Imdb imdb;
    private String type;
    private Tomatoes tomatoes;

}
