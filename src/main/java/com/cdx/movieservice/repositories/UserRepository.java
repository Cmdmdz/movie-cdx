package com.cdx.movieservice.repositories;


import com.cdx.movieservice.repositories.dao.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {
}
