package com.example.spring20240924.controller;

import com.example.spring20240924.dto.c11.Student;
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

    @RequestMapping("sub2")
    public String sub2(Model model) {
        model.addAttribute("list1", List.of(
                Map.of("team", "자이언츠",
                        "price", 10000,
                        "number", 4567
                ),
                Map.of("location", "제주",
                        "name", "바이든"),
                Map.of("company", "삼성")));
        return null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model) {

        model.addAttribute("data", Map.of(
                "list1", List.of("tesla", "volvo", "kia"),
                "languages", List.of("java", "js", "c++", "python")
        ));

        return null;

    }

    @RequestMapping("sub4")
    public String sub4(Model model) {

        model.addAttribute("car",
                Map.of("hyundai",
                        List.of("소나타", "아반떼", "제네시스")));
        model.addAttribute("student",
                Map.of("son",
                        List.of(80, 90, 99)));

        return null;
    }

    @RequestMapping("sub5")
    public String sub5(Model model) {
        // List 내의 JavaBeans
        List<Student> students = List.of(
                new Student(1, "son", 33, 98.1234, "gmail"),
                new Student(5, "hong", 55, 77.33, "yahoo"),
                new Student(7, "messi", 66, 88.44, "daum"),
                new Student(10, "otani", 22, 66.11, "naver"));

        model.addAttribute("students", students);
        return null;

    }
}
