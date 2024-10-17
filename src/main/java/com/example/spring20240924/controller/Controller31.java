package com.example.spring20240924.controller;

import com.example.spring20240924.mapper.Mapper01;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main31")
public class Controller31 {
    final Mapper01 mapper01;

    @RequestMapping("sub1")
    public void sub1(){

        // 비즈니스 로직 (crud)
        String name = mapper01.selectName();

        System.out.println("name = " + name);
    }
}
