package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main13")
public class Controller13 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        model.addAttribute("attr1", "hello model attribute");

    }

    @RequestMapping("sub2")
    public void method2(Model model) {

    }

    @RequestMapping("sub3")
    public void method3(Model model) {
    }

    @RequestMapping("sub4")
    public void method4(Model model) {
    }

    @RequestMapping("sub5")
    public void method5(Model model) {
    }

    @RequestMapping("sub6")
    public void method6(Model model) {
        model.addAttribute("products", List.of("피자", "라면", "돈까스", "콜라"));
        model.addAttribute("players", List.of("오타니", "흥민", "범근", "케인", "지성"));

        model.addAttribute("cityList",
                List.of("seoul", "jeju", "busan", "london", "ny", "la"));

        /*
        <ul>
            <li>seoul</li>
            <li>jeju</li>
            <li>busan</li>
            <li>london</li>
            <li>ny</li>
            <li>la</li>
        </ul>
         */
    }
}
