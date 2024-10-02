package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("main19")
public class Controller19 {

    @RequestMapping("sub1")
    public void sub1(String address, String nick) {
        System.out.println("address = " + address);
        System.out.println("nick = " + nick);
    }

    @RequestMapping("sub2")
    public void sub2(String name, Integer age) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    // sub1.jsp 에 새 form 요소(와 input 요소들)을 작성해서
    // 전송 버튼을 클릭하면
    // /main19/sub3?food=피자&email=yahoo&city=인천
    // 요청되게 작성하고

    // Controller19.sub3 메소드 작성해서 food, email, city
    //  요청 파라미터를 받아서 출력하는 코드 작성
}
