package com.moscocloud.blog.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/blog")
    public String blogMain(Model model) {
        model.addAttribute("title", "Основная страница блога");
        return "blog-main";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Обо мне");
        return "about";
    }
}
