package com.example.spring20240924.controller;

import com.example.spring20240924.dto.c21.MyBean;
import com.example.spring20240924.dto.c21.MyBean4;
import com.example.spring20240924.dto.c21.MyBean5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("main21")
public class Controller21 {
    @GetMapping("sub1")
    public void g1() {
    }

    @PostMapping("sub1")
    public void p1(@ModelAttribute(name = "some1") Object o) {

    }

    @GetMapping("sub2")
    public String g2(@ModelAttribute("some1") Object o) {
        return "/main21/sub1";
    }

    // @ModelAttribute 을 붙인 메소드 아규먼트(객체)는
    // request parameter 가 객체의 property에 binding 된다.
    @GetMapping("sub3")
    public void g3() {
    }

    @PostMapping("sub3")
    public void p3(@ModelAttribute("some") MyBean b) {
        System.out.println("b = " + b);
    }

    @GetMapping("sub4")
    public void g4(@ModelAttribute("data") MyBean4 b) {
        System.out.println("b = " + b);
    }

    @PostMapping("sub5")
    public void p5(@ModelAttribute("values") MyBean5 b) {
        System.out.println("b = " + b);
    }

}
