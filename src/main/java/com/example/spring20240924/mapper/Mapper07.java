package com.example.spring20240924.mapper;

import org.apache.ibatis.annotations.Delete;
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
    void delete1(Integer id);
}
