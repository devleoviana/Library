package com.github.com.devleoviana.Library.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.com.devleoviana.Library.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "book")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameBook;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String author;
    private int publicatedYear;
    private double price;
}