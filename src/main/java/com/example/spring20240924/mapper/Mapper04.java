package com.example.spring20240924.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper04 {
    @Select("""
            SELECT ProdutName
            FROM Produts
            WHERE ProductId = 1
            """)
    String getProductName();
}
