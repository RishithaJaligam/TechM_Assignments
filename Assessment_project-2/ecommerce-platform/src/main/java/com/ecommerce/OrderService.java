package com.ecommerce;

import com.ecommerce.Order;
import com.ecommerce.Product;
import com.ecommerce.OrderRepository;
import com.ecommerce.ProductRepository;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class OrderService {
    private final OrderRepository orderRepo;
    private final ProductRepository productRepo;

    public OrderService(OrderRepository orderRepo, ProductRepository productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    public Order placeOrder(Order order) {
        // Check if product exists
        Product product = productRepo.findById(order.getProductId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        // Check if enough stock is available
        if (product.getQuantity() < order.getQuantity()) {
            throw new RuntimeException("Not enough stock");
        }

        // Reduce stock
        product.setQuantity(product.getQuantity() - order.getQuantity());
        productRepo.save(product);

        // Save the order
        return orderRepo.save(order);
    }
}
