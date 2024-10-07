package com.example.spring20240924.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
@RequestMapping("main25")
public class Controller25 {
    @Autowired
    DataSource dataSource;

    // /main25/sub1?country=uk
    @GetMapping("sub1")
    public void sub1(String country) {
        String sql = STR."""
                SELECT CustomerName
                FROM Customers
                WHERE Country = '\{country}'
                """;

        System.out.println();
        System.out.println(country + "에 있는 고객들");
        try {
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            try (conn; stmt; rs) {
                while (rs.next()) {
                    String name = rs.getString("CustomerName");
                    System.out.println("name = " + name);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
