package com.example.spring20240924.controller;

import com.example.spring20240924.mapper.Mapper07;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main37")
@RequiredArgsConstructor
public class Controller37 {
    final Mapper07 mapper07;

    @GetMapping("sub1")
    public void sub1(Integer id) {
        int cnt = mapper07.delete1(id);
        System.out.println(cnt + "개 행 삭제됨");
    }

    // /main37/sub2?id=5
    // 요청 파라미터 id 값에 해당하는 상품 삭제하는
    // 2번째 메소드, mapper에 delete2 메소드 작성
    @GetMapping("sub2")
    public void sub2(Integer id) {
        int cnt = mapper07.delete2(id);
        System.out.println(cnt + "개 상품 데이터 삭제됨");
    }

    // /main37/sub3?name=lee&city=paris&country=france
    @GetMapping("sub3")
    public void sub3(String name,
                     String city,
                     String country) {

//        name = "son";
//        city = "seoul";
//        country = "korea";

        int cnt = mapper07.insert1(name, city, country);
        System.out.println(cnt + "명 고객 정보 입력됨");
    }

    // 새 상품(상품명, 가격)을 입력하는 코드 작성
    // 4번째 메소드, mapper.insert2 메소드
    @GetMapping("sub4")
    public void sub4(String name,
                     Double price) {
        int c = mapper07.insert2(name, price);
        System.out.println(c + "개 상품 정보 입력됨");
    }

    @GetMapping("sub5")
    public void sub5() {
        
    }


}
