package com.ecommerce;
import com.ecommerce.User;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface UserRepository extends JpaRepository<User, String> {
}
