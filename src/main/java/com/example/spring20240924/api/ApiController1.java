package com.example.spring20240924.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Slf4j
@RequestMapping("/api/main1")
@Controller
public class ApiController1 {

    @PostMapping("sub4")
    public void sub4(@RequestBody Map<String, Object> map) {

        // {title: 책제목, content: 책내용, price: 5000}
        System.out.println(map);

    }

    @PostMapping("sub3")
    public void sub3(@RequestBody Map<String, String> map) {
        System.out.println(map);

    }

    // @RequestBody : JSON -> Map(JavaBeans)로 파싱해줌
    @PostMapping("sub2")
    public void sub2(@RequestBody Map<String, Object> map) {

        System.out.println(map);
        System.out.println("ApiController1.sub2");
    }

    @PostMapping("sub1")
    public void sub1() {
        System.out.println("/api/main1/sub1으로 요청옴");
    }
}
