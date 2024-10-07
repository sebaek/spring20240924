package com.example.spring20240924.controller;

import com.example.spring20240924.dto.c24.Customer;
import com.example.spring20240924.dto.c24.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main24")
public class Controller24 {

    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void sub1() throws SQLException {
        String sql = """
                SELECT DISTINCT City
                FROM Customers
                """;
        // 연결
        Connection con = dataSource.getConnection();
        // 쿼리실행 준비
        Statement stmt = con.createStatement();
        // 쿼리실행
        ResultSet rs = stmt.executeQuery(sql);

        try (con; stmt; rs) {
            // 실행 결과 가공
            while (rs.next()) {
                System.out.println(rs.getString("City"));
            }
        }


    }

    @GetMapping("sub2")
    public void sub2(Model model) throws SQLException {
        String sql = """
                SELECT CustomerName, ContactName, Address
                FROM Customers
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try (con; stmt; rs) {
            List<Customer> list = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("CustomerName");
                String contact = rs.getString("ContactName");
                String address = rs.getString("Address");
                Customer customer = new Customer();
                customer.setName(name);
                customer.setContactName(contact);
                customer.setAddress(address);

                list.add(customer);

            }
            model.addAttribute("customerList", list);
        }
        // jsp로 forward
    }

    @GetMapping("sub3")
    public void sub3(Model model) throws SQLException {
        String sql = """
                SELECT EmployeeID, FirstName, LastName, BirthDate
                FROM Employees
                """;
        // 이 메소드와 Employee, sub3.jsp 작성
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Employee> list = new ArrayList<>();
        try (con; stmt; rs) {
            while (rs.next()) {
                Employee employee = new Employee();
//                employee.setFirstName(rs.getString("FirstName"));
//                employee.setLastName(rs.getString("LastName"));
//                employee.setId(rs.getString("EmployeeID"));
//                employee.setBirthDate(rs.getString("BirthDate"));
                employee.setFirstName(rs.getString(2));
                employee.setLastName(rs.getString(3));
                employee.setId(rs.getString(1));
                employee.setBirthDate(rs.getString(4));
                list.add(employee);
            }
            model.addAttribute("employeeList", list);
        }
    }

    // 상품번호, 상품명, 단위, 가격 을 상품(Products)테이블에서 조회 후 출력
    // ProductID, ProductName, Unit, Price
    // 4번째 메소드, jsp, javaBean(dto) 작성
}
