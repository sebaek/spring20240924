package com.example.spring20240924.dto.c29;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Book {
    private String isbn;
    private String title;
    private String author;
    private Integer price;
    private LocalDate published;
}