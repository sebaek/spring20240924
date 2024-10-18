package com.example.spring20240924.controller;

import com.example.spring20240924.mapper.Mapper06;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main36")
public class Controller36 {
    final Mapper06 mapper06;

    @GetMapping("sub1")
    public void sub1() {
        String name = mapper06.select01(1);
        System.out.println("name = " + name);

        System.out.println(mapper06.select01(2));
        System.out.println(mapper06.select01(3));
        System.out.println(mapper06.select01(4));

        System.out.println();
        // 상품번호를 받아서 상품명을 조회/출력
        // select02
    }
}
