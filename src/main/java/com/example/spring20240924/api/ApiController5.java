package com.example.spring20240924.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/api/main5")
@Controller
public class ApiController5 {
    @GetMapping("sub1")
    @ResponseBody
    public String method1() {
        System.out.println("ApiController5.method1");
        return "sub1";
    }
}
