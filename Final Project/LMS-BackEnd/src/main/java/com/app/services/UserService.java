package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.app.model.User;
import com.app.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public User saveUser(User user) {
        // Encode password before saving
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);
    }
    
    public User updateUserProfile(User user) {
        User existingUser = userRepo.findByEmail(user.getEmail());
        
        // Only encode password if it has changed
        if (!existingUser.getPassword().equals(user.getPassword())) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        
        return userRepo.save(user);
    }
    
    public List<User> getAllUsers() {
        return (List<User>)userRepo.findAll();
    }
    
    public User fetchUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }
    
    public User fetchUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }
    
    public User fetchUserByEmailAndPassword(String email, String password) {
        User user = userRepo.findByEmail(email);
        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return user;
        }
        return null;
    }
    
    public List<User> fetchProfileByEmail(String email) {
        return (List<User>)userRepo.findProfileByEmail(email);
    }
}