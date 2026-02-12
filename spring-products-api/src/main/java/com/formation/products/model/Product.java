package com.formation.products.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Product {

    private String id;
    
    @NotBlank(message = "Le nom ne peut pas être vide")
    private String name;
    
    private String description;
    
    @Positive(message = "Le prix doit être positif")
    private BigDecimal price;
    
    @NotBlank(message = "La catégorie est obligatoire")
    private String category;
    
    private int stock;
    
    private LocalDateTime createdAt;

    // Constructeur par défaut
    public Product() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
    }

    // Constructeur complet
    public Product(String name, String description, BigDecimal price, String category, int stock) {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    // Getters et Setters
    public String getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public LocalDateTime getCreatedAt() { return createdAt; }
}
