package com.example.spring20240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main23")
public class Controller23 {
    @GetMapping("sub1")
    public void sub1(Model model) throws SQLException {
        String sql = "SELECT FirstName FROM Employees";

        String databaseUrl = "jdbc:mariadb://localhost:3306/w3schools";
        String databaseUserName = "root";
        String databasePassWord = "1234";

        // 1. database 연결
        Connection con = DriverManager.getConnection(databaseUrl, databaseUserName, databasePassWord);
        // 2. 실행 준비
        Statement stmt = con.createStatement();
        // 3. 쿼리 실행
        ResultSet rs = stmt.executeQuery(sql);

        // 5. 자원 닫기
        try (con; stmt; rs) {
            // 4. 실행 결과 가공
            // 첫번째 행으로 커서를 이동
//            rs.next();
            // 커서가 가리키는 행의 FirstName 컬럼 데이터 얻기
//            String name1 = rs.getString("FirstName");

            List<String> names = new ArrayList<>();

            while (rs.next()) {
                String name = rs.getString("firstName");
                names.add(name);
            }

            model.addAttribute("nameList", names);
        }


    }

    @GetMapping("sub2")
    public void sub2(Model model) throws SQLException {
        String sql = "SELECT CustomerName FROM Customers";

        String url = "jdbc:mariadb://localhost:3306/w3schools";
        String userName = "root";
        String password = "1234";
        // 연결
        Connection con = DriverManager.getConnection(url, userName, password);
        // 쿼리 실행 준비
        Statement stmt = con.createStatement();
        // 쿼리 실행
        ResultSet rs = stmt.executeQuery(sql);

        try (con; stmt; rs) {
            List<String> list = new ArrayList<>();
            while (rs.next()) {
                // 실행 결과 가공
                String name = rs.getString("CustomerName");
                list.add(name);
            }

            model.addAttribute("nameList", list);
        }
    }

    // 상품명들을 조회하는 세번째 메소드와 jsp 작성

}
