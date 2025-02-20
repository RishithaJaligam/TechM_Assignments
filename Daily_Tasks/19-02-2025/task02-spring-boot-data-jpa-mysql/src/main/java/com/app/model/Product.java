package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private Integer prodId;
    private String prodName;
    private Double prodCost;

    // Constructors
    public Product() {}
    public Product(Integer prodId) {
        this.prodId = prodId;
    }
    public Product(Integer prodId, String prodName, Double prodCost) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodCost = prodCost;
    }

    // Getters and Setters
    public Integer getProdId() { return prodId; }
    public void setProdId(Integer prodId) { this.prodId = prodId; }

    public String getProdName() { return prodName; }
    public void setProdName(String prodName) { this.prodName = prodName; }

    public Double getProdCost() { return prodCost; }
    public void setProdCost(Double prodCost) { this.prodCost = prodCost; }

    @Override
    public String toString() {
        return String.format("%-5d\t%-15s\t%-10.2f", prodId, prodName, prodCost);
    }
}
