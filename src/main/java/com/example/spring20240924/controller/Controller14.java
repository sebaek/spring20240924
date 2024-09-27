package com.example.spring20240924.controller;

import com.example.spring20240924.dto.c14.Book;
import com.example.spring20240924.dto.c14.Member;
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

        model.addAttribute("members", List.of(
                new Member("흥민", 183, 78, "07/08", "토트넘", "FW"),
                new Member("강인", 174, 72, "02/19", "파리", "MF"),
                new Member("현우", 189, 75, "09/25", "울산", "GK"),
                new Member("희찬", 177, 77, "01/26", "울버햄튼", "MF")
        ));
    }

}
