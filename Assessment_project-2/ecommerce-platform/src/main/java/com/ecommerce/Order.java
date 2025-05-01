package com.ecommerce;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "orders")   // ✅ Add this line to avoid 'Order' reserved keyword clash
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long productId;
    private int quantity;
    private String username;  // who placed order
}
