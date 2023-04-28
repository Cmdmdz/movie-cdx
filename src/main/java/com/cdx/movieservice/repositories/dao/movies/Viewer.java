package com.cdx.movieservice.repositories.dao.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Viewer {
    private Double rating;
    private Integer numReviews;
    private Integer meter;
}
