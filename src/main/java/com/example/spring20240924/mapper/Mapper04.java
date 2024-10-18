package com.example.spring20240924.mapper;

import org.apache.ibatis.annotations.*;

import java.time.LocalDate;

@Mapper
public interface Mapper04 {
    @Select("""
            SELECT ProductName
            FROM Products
            WHERE ProductId = 1
            """)
    String getProductName();


    @Select("""
            SELECT ProductName
            FROM Products
            WHERE ProductId = 1
            """)
//    @Insert()
//    @Delete()
//    @Update()
    String select2();

    @Select("""
            SELECT Price
            FROM Products
            WHERE ProductId = 1
            """)
    String select3();

    @Select("""
            SELECT Price
            FROM Products
            WHERE ProductId = 1
            """)
    Double select4();

    @Select("""
            SELECT LastName
            FROM Employees
            WHERE EmployeeId = 1
            """)
    String select5();

    @Select("""
            SELECT CategoryId
            FROM Products
            WHERE ProductId = 2
            """)
    Integer select6();

    @Select("""
            SELECT BirthDate
            FROM Employees
            WHERE EmployeeId = 2
            """)
    LocalDate select7();
}
