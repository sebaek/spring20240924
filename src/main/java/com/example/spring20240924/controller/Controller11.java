package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main11")
public class Controller11 {
    @RequestMapping("sub1")
    public String sub1(Model model) {
        // String, 기본타입, 배열, List, Map, JavaBeans
        var data = List.of(
                Map.of(
                        "name", "흥민",
                        "team", "토트넘"),
                Map.of(
                        "country", "Korea",
                        "location", "강남"),
                Map.of(
                        "price", 6000,
                        "model", "truck")
        );

        model.addAttribute("data", data);

        return null;
    }
}
