package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main13")
public class Controller13 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "hello model attribute");

    }
}
