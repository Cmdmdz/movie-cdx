package com.cdx.movieservice.service;


import com.cdx.movieservice.repositories.MovieRepository;
import com.cdx.movieservice.repositories.dao.movies.Movies;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;


    public Page<Movies> findAllMovies(int page, int size) {
        Pageable pageable;
        pageable = PageRequest.of(page, size);
        return movieRepository.findAll(pageable);
    }

    public Movies findMovieById(String id) {
        Optional<Movies> movieOptional = movieRepository.findById(id);
        return movieOptional.orElse(null);
    }

    public Page<Movies> searchByTitle(String title, Pageable pageable) {
        return movieRepository.findByTitleContainingIgnoreCase(title, pageable);
    }


}
