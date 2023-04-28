package com.cdx.movieservice.service;

import com.cdx.movieservice.repositories.CommentRepository;
import com.cdx.movieservice.repositories.dao.Comments;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentsRepository;

    public Page<String> findByName(String name, Pageable pageable) {
        Page<Comments> comments;
        if (name == null || name.isEmpty()) {
            comments = commentsRepository.findAll(pageable);
        } else {
            comments = commentsRepository.findByNameContainingIgnoreCase(name, pageable);
        }
        return comments.map(Comments::getName);
    }


}
