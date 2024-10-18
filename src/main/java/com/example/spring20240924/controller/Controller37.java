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
//    @GetMapping("sub2")
    // 요청 파라미터 id 값에 해당하는 상품 삭제하는
    // 2번째 메소드, mapper에 delete2 메소드 작성
    

}
