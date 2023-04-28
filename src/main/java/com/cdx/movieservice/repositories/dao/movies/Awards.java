package com.cdx.movieservice.repositories.dao.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Awards {

    private Integer wins;
    private Integer nominations;
    private String text;
}
