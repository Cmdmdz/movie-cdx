package com.cdx.movieservice.controller;

import com.cdx.movieservice.repositories.dao.movies.Movies;
import com.cdx.movieservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/movies")
    public String getMovies(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size,
            @RequestParam(name = "title", required = false) String title,
            Model model) {
        // Search movies if a title is specified
        if (title != null && !title.isEmpty()) {
            Page<Movies> moviesPage = movieService.searchByTitle(title, PageRequest.of(page, size));
            model.addAttribute("movies", moviesPage.getContent());
            model.addAttribute("totalPages", moviesPage.getTotalPages());
            model.addAttribute("currentPage", page);
            model.addAttribute("size", size);
            model.addAttribute("title", title);
        } else {
            Page<Movies> moviesPage = movieService.findAllMovies(page, size);
            model.addAttribute("movies", moviesPage.getContent());
            model.addAttribute("totalPages", moviesPage.getTotalPages());
            model.addAttribute("currentPage", page);
            model.addAttribute("size", size);
        }

        return "movies";
    }


    @GetMapping("/movie/{id}")
    public String showMovieById(@PathVariable("id") String id, Model model) {
        model.addAttribute("movie", movieService.findMovieById(id));
        return "movie";
    }
}
