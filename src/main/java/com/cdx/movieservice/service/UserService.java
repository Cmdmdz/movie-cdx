package com.cdx.movieservice.service;

import com.cdx.movieservice.repositories.UserRepository;
import com.cdx.movieservice.repositories.dao.Comments;
import com.cdx.movieservice.repositories.dao.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Page<String> findByName(String name, Pageable pageable) {
        Page<Users> users;
        if (name == null || name.isEmpty()) {
            users = userRepository.findAll(pageable);
        } else {
            users = userRepository.findByNameContainingIgnoreCase(name, pageable);
        }
        return users.map(Users::getName);
    }

}
