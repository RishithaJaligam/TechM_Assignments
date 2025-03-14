package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data                   // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor      // Generates a no-arg constructor
@AllArgsConstructor     // Generates a constructor with all fields
public class User {

    @Id
    private String email;
    private String username;
    private String userid;
    private String mobile;
    private String gender;
    private String profession;
    private String address;
    private String password;
}
