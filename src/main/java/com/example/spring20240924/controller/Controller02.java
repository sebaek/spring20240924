package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class Controller02 {

    // localhost:8080/main2/sub1
    @RequestMapping("/main2/sub1")
    public void sub1(WebRequest request){
        String name = request.getParameter("name");
        System.out.println("name = " + name);
        System.out.println("Controller02.sub1");
    }

    // localhost:8080/main2/sub2?address=seoul
    // 이 경로로 요청 올 때 일하는 메소드 작성
    //   : 콘솔에 address 파라미터값(seoul)을 출력
    @RequestMapping("/main2/sub2")
    public void sub2(WebRequest request){
        String address = request.getParameter("address");
        System.out.println("address = " + address);
    }

    // request parameter
    //  : 경로 뒤에 ?로 시작
    //    이름과 값이 =로 연결되어 있음 (이름=값)
    //    각 파라미터는 &로 연결되어 있음 (이름1=값1&이름2=값2&이름3=값3)

    // /main2/sub3?address=seoul&email=gmail
    @RequestMapping("/main2/sub3")
    public void sub3(WebRequest request){
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        System.out.println("address = " + address);
        System.out.println("email = " + email);
    }

    // /main2/sub3?info=java&location=강남&country=한국
    // 메소드 작성
}
