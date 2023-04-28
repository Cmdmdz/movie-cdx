package com.cdx.movieservice.controller;

import com.cdx.movieservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public String getCommentsByName(
            @RequestParam(required = false) String name,
            Pageable pageable,
            Model model) {
        Page<String> users = userService.findByName(name, pageable);
        model.addAttribute("users", users);
        model.addAttribute("name", name);

        return "user";
    }

}
