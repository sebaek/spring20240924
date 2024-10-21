package com.example.spring20240924.controller;

import com.example.spring20240924.mapper.Mapper10;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main40")
public class Controller40 {

    private final Mapper10 mapper10;

    @GetMapping("sub1")
    public void method1() {
        System.out.println("두 개 값 모두");
        mapper10.select1("abc", "def");

        System.out.println("name 만");
        mapper10.select1("abc", null);

        System.out.println("contact 만");
        mapper10.select1(null, "def");
    }

    @GetMapping("sub2")
    public void sub2() {
        // SELECT * FROM Employees
        // WHERE EmployeeId = 3
        //   AND LastName = "abc"
        //   AND FirstName = "def"
        mapper10.select2("abc", "def");

        // SELECT * FROM Employees
        // WHERE EmployeeId = 3
        //   AND LastName = "abc"
        mapper10.select2("abc", null);

        // SELECT * FROM Employees
        // WHERE EmployeeId = 3
        //   AND FirstName = "def"
        mapper10.select2(null, "def");
    }
}
