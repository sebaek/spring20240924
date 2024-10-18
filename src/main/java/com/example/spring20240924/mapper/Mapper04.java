package com.example.spring20240924.mapper;

import org.apache.ibatis.annotations.*;

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
}
