package com.example.spring20240924.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
@RequestMapping("main28")
public class Controller28 {
    @Autowired
    DataSource dataSource;

    // /main28/sub1?name=흥민&contact=득점왕
    @PostMapping("sub1")
    public void sub1(String name, String contact) {
        String sql = """
                INSERT INTO Customers
                (CustomerName, ContactName)
                VALUES
                (?, ?)
                """;
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            try (conn; pstmt) {
                pstmt.setString(1, name);
                pstmt.setString(2, contact);
                //        pstmt.executeQuery(); // SELECT
                pstmt.executeUpdate(); // INSERT, UPDATE, DELETE
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("sub2")
    public void sub2() {

    }

    // get /main28/sub3 은 상품입력 form 이 있는 jsp로 forward
    // post /main28/sub4 은 새 상품을 insert하는 로직 실
}
