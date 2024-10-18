package com.example.spring20240924.controller;

import com.example.spring20240924.mapper.Mapper06;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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
        String n1 = mapper06.select02(1);
        String n2 = mapper06.select02(2);
        String n3 = mapper06.select02(3);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
    }

    @GetMapping("sub2")
    public void sub2() {
        List<String> list = mapper06.select03("Germany", "USA");
        list.forEach(System.out::println);

        System.out.println();
        List<String> l = mapper06.select04(50, 200);
        l.forEach(System.out::println);

        System.out.println();
        // 두 날짜를 입력받아서 두 날짜사이에 태어난 직원이름들 조회/출력
        // select05

        // 두 도시를 입력받아서 두 도시에 있는 고객명들 조회/출력
        // select06
        
    }
}
