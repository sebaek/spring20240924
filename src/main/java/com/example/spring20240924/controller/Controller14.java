package com.example.spring20240924.controller;

import com.example.spring20240924.dto.c14.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main14")
public class Controller14 {
    @RequestMapping("sub1")
    public void sub1(Model model) {
        model.addAttribute("list", List.of(
                new Book("java", "shin", "hanbit", 1000, 50000),
                new Book("git", "linus", "scm", 200, 30000),
                new Book("react", "adam", "meta", 450, 40000),
                new Book("vue", "captain", "apple", 300, 35000)));

    }

}
