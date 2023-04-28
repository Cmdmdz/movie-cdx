package com.cdx.movieservice.repositories.dao;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "theaters")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Theaters {

    @Id
    private String id;

    @Field("theaterId")
    private int theaterId;

    private Location location;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Location {
        private Address address;
        private Geo geo;

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Address {
        private String street1;
        private String city;
        private String state;
        private String zipcode;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Geo {
        private String type;
        private double[] coordinates;

    }

}
