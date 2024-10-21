package com.example.spring20240924.controller;

import com.example.spring20240924.mapper.Mapper09;
import com.example.spring20240924.service.Service01;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("main39")
@RequiredArgsConstructor
public class Controller39 {
    private final Service01 service01;

    @GetMapping("sub1")
    public void method1(Integer money) {
        service01.transferMoney(money);
    }
}
