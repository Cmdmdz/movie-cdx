package com.cdx.movieservice.repositories.dao.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Imdb {

    private Double  rating;
    private Integer votes;
    private Integer id;
}
