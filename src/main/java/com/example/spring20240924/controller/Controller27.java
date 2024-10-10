package com.example.spring20240924.controller;

import com.example.spring20240924.dto.c26.Customer;
import com.example.spring20240924.dto.c26.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main27")
public class Controller27 {
    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void sub1(Model model, String id) throws SQLException {
        // SQL injection
        String sql = STR."""
                SELECT *
                FROM Customers
                WHERE CustomerId = \{id}
                """;
        Connection conn = dataSource.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        try (conn; stmt; rs) {
            List<Customer> list = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setName(rs.getString("CustomerName"));
                customer.setContact(rs.getString("ContactName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setId(rs.getString("CustomerId"));
                customer.setCountry(rs.getString("Country"));
                list.add(customer);
            }
            model.addAttribute("customerList", list);
        }
    }

    // Statement 객체는 SQL injection 위험 있음
    // -> PreparedStatement 객체를 사용해야 함
    @GetMapping("sub2")
    public String sub2(Model model, String id) throws SQLException {
        String sql = """
                SELECT *
                FROM Customers
                WHERE CustomerId = ?
                """;

        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();

        try (conn; pstmt; rs) {
            List<Customer> list = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setName(rs.getString("CustomerName"));
                customer.setContact(rs.getString("ContactName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setCountry(rs.getString("Country"));
                customer.setId(rs.getString("CustomerId"));
                list.add(customer);
            }
            model.addAttribute("customerList", list);
        }

        return "/main27/sub1";
    }

    // /main26/sub5
    // /main27/sub3
    @GetMapping("sub3")
    public String sub3(Model model, String from, String to) throws SQLException {
        String sql = """
                SELECT *
                FROM Products
                WHERE Price BETWEEN ? AND ?
                ORDER BY Price
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, from);
        pstmt.setString(2, to);
        ResultSet rs = pstmt.executeQuery();

        try (conn; pstmt; rs) {
            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getString("ProductID"));
                product.setName(rs.getString("ProductName"));
                product.setCategoryId(rs.getString("CategoryID"));
                product.setSupplierId(rs.getString("SupplierID"));
                product.setUnit(rs.getString("Unit"));
                product.setPrice(rs.getString("Price"));
                list.add(product);
            }
            model.addAttribute("productList", list);
        }

        return "/main26/sub5";
    }


}
