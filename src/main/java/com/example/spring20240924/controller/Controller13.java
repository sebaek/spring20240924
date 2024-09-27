package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

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

    @RequestMapping("sub7")
    public void method7(Model model) {
        model.addAttribute("people",
                Map.of("kim", "seoul",
                        "lee", "busan",
                        "choi", "jeju",
                        "park", "ulsan"));

        model.addAttribute("players",
                Map.of("messi", "아르헨티나",
                        "faker", "t1",
                        "음바페", "레알",
                        "흥민", "한국"));

        model.addAttribute("food",
                Map.of("초콜릿", "가나",
                        "탄산", "코카콜라",
                        "버거", "빅맥",
                        "피자", "하와이안"));
    }
}





