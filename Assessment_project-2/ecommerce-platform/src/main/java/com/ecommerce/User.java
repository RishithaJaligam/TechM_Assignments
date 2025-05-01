package com.ecommerce;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    private String username;
    private String password;
    private String role; // ROLE_ADMIN or ROLE_CUSTOMER
}
