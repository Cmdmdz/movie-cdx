package com.cdx.movieservice.controller;

import com.cdx.movieservice.repositories.dao.Comments;
import com.cdx.movieservice.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentsService;

    @GetMapping("/comments")
    public String getCommentsByName(
            @RequestParam(required = false) String name,
            Pageable pageable,
            Model model) {
        Page<String> comments = commentsService.findByName(name, pageable);
        model.addAttribute("comments", comments);
        model.addAttribute("name", name);

        return "comment";
    }
}
