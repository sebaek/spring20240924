package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main20")
public class Controller20 {
    @RequestMapping("sub1")
    public void sub1() {

    }

    @RequestMapping("sub2")
    public void sub2(String name,
                     String pw,
                     String note) {
        System.out.println("name = " + name);
        System.out.println("pw = " + pw);
        System.out.println("note = " + note);

    }
}
