package com.example.spring20240924.controller;

import com.example.spring20240924.mapper.Mapper04;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main34")
@RequiredArgsConstructor
public class Controller34 {

    final Mapper04 mapper04;

    @GetMapping("sub1")
    public void sub1() {
        String name = mapper04.getProductName();
        System.out.println(name);
    }

    @GetMapping("sub2")
    public void sub2() {
        String s = mapper04.select2();
        String s1 = mapper04.select3();
        Double v = mapper04.select4();
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println("v = " + v);

        // 1번 직원의 LastName 조회
        mapper04.select5();

        // 2번 상품의 CategoryId 조회
        mapper04.select6();

        // 2번 직원의 생일 조회
        mapper04.select7();

    }
}
