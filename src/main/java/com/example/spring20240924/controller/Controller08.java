package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main8")
public class Controller08 {

    @RequestMapping("sub1")
    public String sub1(Model model) {
        // 1. 요청 분석/가공
        // 2. 비지니스 로직 실행
        // 3. Model 에 일한 결과 넣고 (넣은 값-attribute)
        model.addAttribute("result1", "Hello World");

        // 4. View로 포워딩

        return null;
    }

    // 할 일1
    // /main8/sub2 로 요청 오면
    // model에 address 라는 이름의 "서울" 값(attribute)을 넣고
    // /WEB-INF/view/main8/sub2.jsp 로 포워드

    // 할 일2
    // /WEB-INF/view/main8/sub2.jsp 에서
    // address라는 attribute 꺼내서 HTML 완성해서 응답하기
    


}
