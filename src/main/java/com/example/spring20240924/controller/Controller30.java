package com.example.spring20240924.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Controller
@RequestMapping("main30")
public class Controller30 {
    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public String sub1() {
        int t = 500;
        String sql1 = """
                UPDATE db1.my_table58
                SET money = money - ?
                WHERE name = 'kim'
                """;
        String sql2 = """
                UPDATE db1.my_table58
                SET money = money + ?
                WHERE name = 'lee'
                """;

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql1);
            ps.setInt(1, t);
            ps.executeUpdate();

            PreparedStatement pss = conn.prepareStatement(sql2);
            pss.setInt(1, t);
            pss.executeUpdate();

            pss.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @GetMapping("sub2")
    public String sub2() {
        int t = 500;
        String sql1 = """
                UPDATE db1.my_table58
                SET money = money - ?
                WHERE name = 'kim'
                """;
        String sql2 = """
                UPDATE db1.my_table58
                SET money = money + ?
                WHERE name = 'lee'
                """;

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql1);
            ps.setInt(1, t);
            ps.executeUpdate();

            int a = 0;
            int b = 5 / a; // Exception

            PreparedStatement pss = conn.prepareStatement(sql2);
            pss.setInt(1, t);
            pss.executeUpdate();

            pss.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @GetMapping("sub3")
    public String sub3() {
        int t = 500;
        String sql1 = """
                UPDATE db1.my_table58
                SET money = money - ?
                WHERE name = 'kim'
                """;
        String sql2 = """
                UPDATE db1.my_table58
                SET money = money + ?
                WHERE name = 'lee'
                """;

        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql1);
            ps.setInt(1, t);
            ps.executeUpdate();

            int a = 0;
            int b = 5 / a; // Exception

            PreparedStatement pss = conn.prepareStatement(sql2);
            pss.setInt(1, t);
            pss.executeUpdate();

            conn.commit();

            pss.close();
            ps.close();

        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return null;
    }

}
