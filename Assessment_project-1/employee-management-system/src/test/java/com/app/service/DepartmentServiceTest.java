package com.app.service;

import com.app.dto.DepartmentDTO;
import com.app.exception.ResourceNotFoundException;
import com.app.model.Department;
import com.app.repository.DepartmentRepository;
import com.app.service.imp.DepartmentServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DepartmentServiceTest {

    @Mock
    private DepartmentRepository departmentRepository;

    @Spy // Use a real ModelMapper instead of a mock
    private ModelMapper modelMapper = new ModelMapper();

    @InjectMocks
    private DepartmentServiceImpl departmentService;

    private Department department;
    private DepartmentDTO departmentDTO;

    @BeforeEach
    void setUp() {
        department = new Department();
        department.setId(1L);
        department.setName("IT");
        department.setDescription("Information Technology");
        
        departmentDTO = new DepartmentDTO();
        departmentDTO.setId(1L);
        departmentDTO.setName("IT");
        departmentDTO.setDescription("Information Technology");
    }

    @Test
    void getAllDepartments_ShouldReturnAllDepartments() {
        // Arrange
        when(departmentRepository.findAll()).thenReturn(Arrays.asList(department));

        // Act
        List<DepartmentDTO> result = departmentService.getAllDepartments();

        // Assert
        assertEquals(1, result.size());
        assertEquals(department.getId(), result.get(0).getId());
        assertEquals(department.getName(), result.get(0).getName());
        verify(departmentRepository, times(1)).findAll();
    }

    @Test
    void getDepartmentById_WhenExists_ShouldReturnDepartment() {
        // Arrange
        when(departmentRepository.findById(1L)).thenReturn(Optional.of(department));

        // Act
        DepartmentDTO result = departmentService.getDepartmentById(1L);

        // Assert
        assertNotNull(result);
        assertEquals(department.getId(), result.getId());
        assertEquals(department.getName(), result.getName());
        verify(departmentRepository, times(1)).findById(1L);
    }

    @Test
    void getDepartmentById_WhenNotExists_ShouldThrowException() {
        // Arrange
        when(departmentRepository.findById(1L)).thenReturn(Optional.empty());

        // Act & Assert
        assertThrows(ResourceNotFoundException.class, () -> {
            departmentService.getDepartmentById(1L);
        });
    }

    @Test
    void createDepartment_ShouldSaveAndReturnDepartment() {
        // Arrange
        when(departmentRepository.save(any(Department.class))).thenReturn(department);

        // Act
        DepartmentDTO result = departmentService.createDepartment(departmentDTO);

        // Assert
        assertNotNull(result);
        assertEquals(department.getId(), result.getId());
        assertEquals(department.getName(), result.getName());
        verify(departmentRepository, times(1)).save(any(Department.class));
    }

    @Test
    void updateDepartment_WhenExists_ShouldUpdateAndReturnDepartment() {
        // Arrange
        Department updatedDepartment = new Department();
        updatedDepartment.setId(1L);
        updatedDepartment.setName("IT Updated");
        updatedDepartment.setDescription("Updated IT Department");

        DepartmentDTO updatedDTO = new DepartmentDTO();
        updatedDTO.setId(1L);
        updatedDTO.setName("IT Updated");
        updatedDTO.setDescription("Updated IT Department");

        when(departmentRepository.findById(1L)).thenReturn(Optional.of(department));
        when(departmentRepository.save(any(Department.class))).thenReturn(updatedDepartment);

        // Act
        DepartmentDTO result = departmentService.updateDepartment(1L, updatedDTO);

        // Assert
        assertEquals("IT Updated", result.getName());
        verify(departmentRepository, times(1)).save(any(Department.class));
    }

    @Test
    void deleteDepartment_WhenExists_ShouldDeleteDepartment() {
        // Arrange
        when(departmentRepository.findById(1L)).thenReturn(Optional.of(department));
        doNothing().when(departmentRepository).delete(any(Department.class));

        // Act
        departmentService.deleteDepartment(1L);

        // Assert
        verify(departmentRepository, times(1)).delete(any(Department.class));
    }
}