package com.ecommerce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            if (userRepository.count() == 0) { // Insert only if the database is empty

                // Create admin user with encrypted password
                User admin = User.builder()
                        .username("admin")
                        .password(passwordEncoder.encode("adminpass"))  // Encode password
                        .role("ROLE_ADMIN")
                        .build();

                // Create customer user with encrypted password
                User customer = User.builder()
                        .username("customer")
                        .password(passwordEncoder.encode("customerpass"))  // Encode password
                        .role("ROLE_CUSTOMER")
                        .build();

                // Save both users to the repository
                userRepository.save(admin);
                userRepository.save(customer);

                System.out.println("✅ Sample users inserted into H2 database!");
            }
        };
    }
}
