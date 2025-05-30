package com.aayora.store.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 500)
    private String description;

    @Positive
    private double price;

    @PositiveOrZero
    private int stockQuantity;

    @NotBlank
    @Size(max = 50)
    private String category;

    @Size(max = 255)
    private String imageUrl;
}