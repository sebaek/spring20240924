package com.example.spring20240924.controller;

import com.example.spring20240924.dto.c26.Customer;
import com.example.spring20240924.dto.c26.Category;
import com.example.spring20240924.dto.c26.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main26")
public class Controller26 {
    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void sub1(Model model, String categoryId, String order) throws Exception {
        String categorySQL = """
                SELECT *
                FROM Categories
                ORDER BY CategoryID
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(categorySQL);
        try (con; stmt; rs) {
            List<Category> categories = new ArrayList<>();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getString("CategoryID"));
                category.setName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));

                categories.add(category);
            }
            model.addAttribute("categoryList", categories);

        }

        // 상품 조회 쿼리
        String productSQL = """
                SELECT *
                FROM Products
                """;
        if (categoryId != null && !categoryId.equals("0")) {
            productSQL += STR."""
                    WHERE CategoryId = \{categoryId}
                    """;
        }
        if (order != null) {
            productSQL += switch (order) {
                case "name" -> """
                        ORDER BY ProductName
                        """;
                case "price" -> """
                        ORDER BY Price
                        """;
                default -> "";
            };
        }
        Connection con2 = dataSource.getConnection();
        Statement stmt2 = con2.createStatement();
        ResultSet rs2 = stmt2.executeQuery(productSQL);
        try (con2; stmt2; rs2) {
            List<Product> products = new ArrayList<>();
            while (rs2.next()) {
                Product product = new Product();
                product.setId(rs2.getString("ProductID"));
                product.setName(rs2.getString("ProductName"));
                product.setCategoryId(rs2.getString("CategoryID"));
                product.setSupplierId(rs2.getString("SupplierID"));
                product.setUnit(rs2.getString("Unit"));
                product.setPrice(rs2.getString("Price"));
                products.add(product);
            }
            model.addAttribute("productList", products);
        }
    }

    @GetMapping("sub2")
    public void sub2(Model model, String country, String order) throws Exception {
        String countrySql = """
                SELECT DISTINCT Country
                FROM Customers
                ORDER BY Country
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(countrySql);
        try (con; stmt; rs) {
            List<String> countries = new ArrayList<>();
            while (rs.next()) {
                countries.add(rs.getString("Country"));
            }
            model.addAttribute("countryList", countries);
        }

        //
        String customerSql = STR."""
                SELECT *
                FROM Customers
                WHERE Country = '\{country}'
                """;
        if (order != null) {
            customerSql += switch (order) {
                case "name" -> """
                        ORDER BY CustomerName
                        """;
                case "contact" -> """
                        ORDER BY ContactName
                        """;
                default -> "";
            };
        }

        Connection con2 = dataSource.getConnection();
        Statement stmt2 = con2.createStatement();
        ResultSet rs2 = stmt2.executeQuery(customerSql);
        try (con2; stmt2; rs2) {
            List<Customer> customers = new ArrayList<>();
            while (rs2.next()) {
                Customer customer = new Customer();
                customer.setId(rs2.getString("CustomerID"));
                customer.setName(rs2.getString("CustomerName"));
                customer.setContact(rs2.getString("ContactName"));
                customer.setAddress(rs2.getString("Address"));
                customer.setCity(rs2.getString("City"));
                customer.setCountry(rs2.getString("Country"));
                customer.setPostalCode(rs2.getString("PostalCode"));
                customers.add(customer);
            }
            model.addAttribute("customerList", customers);
        }
    }
}
