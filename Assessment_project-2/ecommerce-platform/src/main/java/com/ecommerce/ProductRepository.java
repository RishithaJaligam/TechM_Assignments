package com.ecommerce;
import com.ecommerce.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface ProductRepository extends JpaRepository<Product, Long> {
}