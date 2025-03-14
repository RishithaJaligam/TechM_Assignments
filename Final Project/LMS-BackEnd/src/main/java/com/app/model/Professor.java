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
public class Professor {
    
    @Id
    private String email;
    private String professorname;
    private String professorid;
    private String degreecompleted;
    private String institutionname;
    private String department;
    private String experience;
    private String mobile;
    private String gender;
    private String password;
    private String status;
}
