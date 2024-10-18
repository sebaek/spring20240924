package com.example.spring20240924.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper06 {

    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE CustomerID = #{id}
            """)
    String select01(Integer id);
}
