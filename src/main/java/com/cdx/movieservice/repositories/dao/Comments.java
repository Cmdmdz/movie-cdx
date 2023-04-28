package com.cdx.movieservice.repositories.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comments {

    @Id
    private String id;
    private String name;
    private String email;
    private String movieId;
    private String text;
    private Date date;
}
