package com.cdx.movieservice.repositories;


import com.cdx.movieservice.repositories.dao.movies.Movies;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movies, String> {

    Page<Movies> findByTitleContainingIgnoreCase(String title, Pageable pageable);

}
