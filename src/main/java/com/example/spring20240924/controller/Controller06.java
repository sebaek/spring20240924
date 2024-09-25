package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.StringTemplate.STR;

@Controller
@RequestMapping("main6")
public class Controller06 {
    @RequestMapping("sub1")
    @ResponseBody
    public String sub1(String search) {
        String result = search + "를 검색한 결과"; //

        String html = STR."""
                <html>
                    <body>
                        <p>\{result}</p>
                    </body>
                </html>
                """;

        return html;
    }

    // /main6/sub2
    @RequestMapping("sub2")
    public String method2() {
        // 1. 요청 정보 분석/가공
        // 2. 비즈니스 로직 실행

        // 3. 응답(html)

        // 앞에 /WEB-INF/view/
        // 뒤에 .jsp
        return "/world"; // view 이름

        // 최종 jsp 위치
        // /WEB-INF/view/world.jsp
    }

    @RequestMapping("sub3")
    public String method3() {

        // /WEB-INF/view/hello.jsp
        return "/hello";
    }

    // /main6/sub4 으로 요청왔을 때
    // /WEB-INF/view/hi.jsp 의 내용이 응답
    
    // 메소드 작성, jsp 만들기

}
