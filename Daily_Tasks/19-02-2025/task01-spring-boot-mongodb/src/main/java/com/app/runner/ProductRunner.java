package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.app.model.Product;
import com.app.repo.ProductRepository;
import java.util.List;

@Component
public class ProductRunner implements CommandLineRunner {
    
    private final ProductRepository productRepository;

    // Constructor Injection
    public ProductRunner(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) {
        // Insert sample data if collection is empty
        if (productRepository.count() == 0) {
            productRepository.save(new Product(null, "Laptop", 75000.0));
            productRepository.save(new Product(null, "Smartphone", 45000.0));
        }

        // Fetch and print all products
        List<Product> products = productRepository.findAll();
        System.out.println("Products from MongoDB:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
