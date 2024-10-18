package com.example.spring20240924.controller;

import com.example.spring20240924.mapper.Mapper05;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main35")
public class Controller35 {

    private final Mapper05 mapper05;

    @GetMapping("sub1")
    public void sub1() {
        mapper05.select1()
                .forEach(System.out::println);
    }

}
