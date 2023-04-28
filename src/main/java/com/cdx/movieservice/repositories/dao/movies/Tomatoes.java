package com.cdx.movieservice.repositories.dao.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tomatoes {
    private Viewer viewer;

    @Field("lastUpdated")
    private Date lastUpdated;
}
