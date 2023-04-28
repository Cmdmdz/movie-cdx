package com.cdx.movieservice.repositories;


import com.cdx.movieservice.repositories.dao.Comments;
import com.cdx.movieservice.repositories.dao.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {

    Page<Users> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
