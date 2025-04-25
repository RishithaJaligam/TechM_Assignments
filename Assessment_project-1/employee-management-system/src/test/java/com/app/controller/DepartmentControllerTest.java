package com.app.controller;


import com.app.dto.DepartmentDTO;
import com.app.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DepartmentControllerTest {

    @Mock
    private DepartmentService departmentService;

    @InjectMocks
    private DepartmentController departmentController;

    private DepartmentDTO departmentDTO;

    @BeforeEach
    void setUp() {
    	departmentDTO = new DepartmentDTO();
        departmentDTO.setId(1L);
        departmentDTO.setName("IT");
        departmentDTO.setDescription("Information Technology");
    }

    @Test
    void createDepartment_ShouldReturnCreatedDepartment() {
        // Arrange
        when(departmentService.createDepartment(departmentDTO)).thenReturn(departmentDTO);

        // Act
        ResponseEntity<DepartmentDTO> response = departmentController.createDepartment(departmentDTO);

        // Assert
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(departmentDTO, response.getBody());
        verify(departmentService, times(1)).createDepartment(departmentDTO);
    }

    @Test
    void getAllDepartments_ShouldReturnAllDepartments() {
        // Arrange
        List<DepartmentDTO> departments = Arrays.asList(departmentDTO);
        when(departmentService.getAllDepartments()).thenReturn(departments);

        // Act
        ResponseEntity<List<DepartmentDTO>> response = departmentController.getAllDepartments();

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(1, response.getBody().size());
        verify(departmentService, times(1)).getAllDepartments();
    }

    @Test
    void getDepartmentById_WhenExists_ShouldReturnDepartment() {
        // Arrange
        when(departmentService.getDepartmentById(1L)).thenReturn(departmentDTO);

        // Act
        ResponseEntity<DepartmentDTO> response = departmentController.getDepartmentById(1L);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(departmentDTO, response.getBody());
        verify(departmentService, times(1)).getDepartmentById(1L);
    }

    @Test
    void updateDepartment_ShouldReturnUpdatedDepartment() {
        // Arrange
    	DepartmentDTO updatedDTO = new DepartmentDTO();
    	updatedDTO.setId(1L);
    	updatedDTO.setName("IT Updated");
    	updatedDTO.setDescription("Updated IT Department");
        when(departmentService.updateDepartment(1L, updatedDTO)).thenReturn(updatedDTO);

        // Act
        ResponseEntity<DepartmentDTO> response = departmentController.updateDepartment(1L, updatedDTO);

        // Assert
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("IT Updated", response.getBody().getName());
        verify(departmentService, times(1)).updateDepartment(1L, updatedDTO);
    }

    @Test
    void deleteDepartment_ShouldReturnNoContent() {
        // Arrange
        doNothing().when(departmentService).deleteDepartment(1L);

        // Act
        ResponseEntity<Void> response = departmentController.deleteDepartment(1L);

        // Assert
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(departmentService, times(1)).deleteDepartment(1L);
    }
}