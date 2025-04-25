package com.app.controller;


import com.app.dto.EmployeeDTO;
import com.app.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeController employeeController;

    private EmployeeDTO employeeDTO1;
    private EmployeeDTO employeeDTO2;

    @BeforeEach
    void setUp() {
        employeeDTO1 = new EmployeeDTO();
        employeeDTO1.setId(1L);
        employeeDTO1.setFirstName("John");
        employeeDTO1.setLastName("Doe");
        employeeDTO1.setEmail("john.doe@example.com");
        employeeDTO1.setPhoneNumber("+1234567890");
        employeeDTO1.setHireDate(LocalDate.now());
        employeeDTO1.setSalary(new BigDecimal("5000.00"));
        employeeDTO1.setDepartmentId(1L);

        employeeDTO2 = new EmployeeDTO();
        employeeDTO2.setId(2L);
        employeeDTO2.setFirstName("Jane");
        employeeDTO2.setLastName("Smith");
        employeeDTO2.setEmail("jane.smith@example.com");
        employeeDTO2.setPhoneNumber("+9876543210");
        employeeDTO2.setHireDate(LocalDate.now());
        employeeDTO2.setSalary(new BigDecimal("6000.00"));
        employeeDTO2.setDepartmentId(1L);
    }

    @Test
    void getAllEmployees() {
        List<EmployeeDTO> employeeList = Arrays.asList(employeeDTO1, employeeDTO2);
        when(employeeService.getAllEmployees()).thenReturn(employeeList);

        ResponseEntity<List<EmployeeDTO>> response = employeeController.getAllEmployees();

        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2, response.getBody().size());
        verify(employeeService, times(1)).getAllEmployees();
    }

    @Test
    void getEmployeeById() {
        when(employeeService.getEmployeeById(1L)).thenReturn(employeeDTO1);

        ResponseEntity<EmployeeDTO> response = employeeController.getEmployeeById(1L);

        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(employeeDTO1, response.getBody());
        verify(employeeService, times(1)).getEmployeeById(1L);
    }

    @Test
    void createEmployee() {
        when(employeeService.createEmployee(employeeDTO1)).thenReturn(employeeDTO1);

        ResponseEntity<EmployeeDTO> response = employeeController.createEmployee(employeeDTO1);

        assertNotNull(response);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(employeeDTO1, response.getBody());
        verify(employeeService, times(1)).createEmployee(employeeDTO1);
    }

    @Test
    void updateEmployee() {
        when(employeeService.updateEmployee(1L, employeeDTO1)).thenReturn(employeeDTO1);

        ResponseEntity<EmployeeDTO> response = employeeController.updateEmployee(1L, employeeDTO1);

        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(employeeDTO1, response.getBody());
        verify(employeeService, times(1)).updateEmployee(1L, employeeDTO1);
    }

    @Test
    void deleteEmployee() {
        doNothing().when(employeeService).deleteEmployee(1L);

        ResponseEntity<Void> response = employeeController.deleteEmployee(1L);

        assertNotNull(response);
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
        verify(employeeService, times(1)).deleteEmployee(1L);
    }

    @Test
    void getEmployeesByDepartment() {
        List<EmployeeDTO> employeeList = Arrays.asList(employeeDTO1, employeeDTO2);
        when(employeeService.getEmployeesByDepartment(1L)).thenReturn(employeeList);

        ResponseEntity<List<EmployeeDTO>> response = employeeController.getEmployeesByDepartment(1L);

        assertNotNull(response);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(2, response.getBody().size());
        verify(employeeService, times(1)).getEmployeesByDepartment(1L);
    }
}