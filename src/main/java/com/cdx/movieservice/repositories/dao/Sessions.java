package com.cdx.movieservice.repositories.dao;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "sessions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sessions {

    @Id
    private String id;

    @Field("user_id")
    private String userId;

    private String jwt;
}
