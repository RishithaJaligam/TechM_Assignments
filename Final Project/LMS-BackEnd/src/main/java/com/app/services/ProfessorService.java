package com.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.app.model.Professor;
import com.app.repository.ProfessorRepository;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepo;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public Professor saveProfessor(Professor professor) {
        // Encode password before saving
        professor.setPassword(passwordEncoder.encode(professor.getPassword()));
        return professorRepo.save(professor);
    }
    
    public Professor addNewProfessor(Professor professor) {
        // Encode password before saving
        professor.setPassword(passwordEncoder.encode(professor.getPassword()));
        return professorRepo.save(professor);
    }
    
    public Professor updateProfessorProfile(Professor professor) {
        Professor existingProfessor = professorRepo.findByEmail(professor.getEmail());
        
        // Only encode password if it has changed
        if (!existingProfessor.getPassword().equals(professor.getPassword())) {
            professor.setPassword(passwordEncoder.encode(professor.getPassword()));
        }
        
        return professorRepo.save(professor);
    }
    
    public List<Professor> getAllProfessors() {
        return (List<Professor>)professorRepo.findAll();
    }
    
    public List<Professor> getProfessorListByEmail(String email) {
        return (List<Professor>)professorRepo.findProfessorListByEmail(email);
    }
    
    public Professor fetchProfessorByEmail(String email) {
        return professorRepo.findByEmail(email);
    }
    
    public Professor fetchProfessorByProfessorname(String professorname) {
        return professorRepo.findByProfessorname(professorname);
    }
    
    public Professor fetchProfessorByEmailAndPassword(String email, String password) {
        Professor professor = professorRepo.findByEmail(email);
        if (professor != null && passwordEncoder.matches(password, professor.getPassword())) {
            return professor;
        }
        return null;
    }
    
    public List<Professor> fetchProfileByEmail(String email) {
        return (List<Professor>)professorRepo.findProfileByEmail(email);
    }

    public void updateStatus(String email) {
        professorRepo.updateStatus(email);
    }

    public void rejectStatus(String email) {
        professorRepo.rejectStatus(email);
    }

    public List<Professor> getProfessorsByEmail(String email) {
        return professorRepo.findProfessorListByEmail(email);
    }
}