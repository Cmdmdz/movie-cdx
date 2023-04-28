package com.cdx.movieservice.repositories;

import com.cdx.movieservice.repositories.dao.Comments;
import com.cdx.movieservice.repositories.dao.movies.Movies;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comments, String> {

    Page<Comments> findByNameContainingIgnoreCase(String name, Pageable pageable);
    Page<Comments> findByName(String name, Pageable pageable);

}
