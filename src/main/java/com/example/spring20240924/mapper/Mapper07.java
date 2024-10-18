package com.example.spring20240924.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface Mapper07 {

    @Select("""
            SELECT *
            FROM Customers
            """)
    List<Map<String, Object>> select1();

    @Delete("""
            DELETE FROM Customers
            WHERE CustomerId = #{id}
            """)
    int delete1(Integer id);

    @Delete("""
            DELETE FROM Products
            WHERE ProductId = #{id}
            """)
    int delete2(Integer id);

    @Insert("""
            INSERT INTO Customers
            (CustomerName, City, Country)
            VALUES (#{name}, #{city}, #{country})
            """)
    int insert1(String name, String city, String country);

    @Insert("""
            INSERT INTO Products
            (ProductName, Price)
            VALUES (#{name}, #{price})
            """)
    int insert2(String name, Double price);
}
