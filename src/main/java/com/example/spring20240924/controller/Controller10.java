package com.example.spring20240924.controller;

import com.example.spring20240924.dto.c10.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main10")
public class Controller10 {

    @RequestMapping("sub1")
    public String sub1(Model model) {

        // javaBeans : get, set 메소드가 있는 객체(클래스)

        var obj = new Student();
        obj.setId(11);
        obj.setName("donald");
        obj.setEmail("donald@gmail.com");

        model.addAttribute("student", obj);
        return null;
    }
}
