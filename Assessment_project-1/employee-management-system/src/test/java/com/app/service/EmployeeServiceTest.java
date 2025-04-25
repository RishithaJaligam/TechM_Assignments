package com.app.service;

import com.app.dto.EmployeeDTO;
import com.app.exception.ResourceNotFoundException;
import com.app.model.Department;
import com.app.model.Employee;
import com.app.repository.DepartmentRepository;
import com.app.repository.EmployeeRepository;
import com.app.service.imp.EmployeeServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @Mock
    private DepartmentRepository departmentRepository;

    @Mock
    private ModelMapper modelMapper;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private Employee employee;
    private EmployeeDTO employeeDTO;

    @BeforeEach
    void setUp() {
        Department department = new Department();
        department.setId(1L);
        department.setName("IT");

        employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setEmail("john.doe@example.com");
        employee.setPhoneNumber("+1234567890");
        employee.setHireDate(LocalDate.now());
        employee.setSalary(new BigDecimal("5000.00"));
        employee.setDepartment(department);

        employeeDTO = new EmployeeDTO();
        employeeDTO.setId(1L);
        employeeDTO.setFirstName("John");
        employeeDTO.setLastName("Doe");
        employeeDTO.setEmail("john.doe@example.com");
        employeeDTO.setPhoneNumber("+1234567890");
        employeeDTO.setHireDate(LocalDate.now());
        employeeDTO.setSalary(new BigDecimal("5000.00"));
        employeeDTO.setDepartmentId(1L);
        
        // Setup common modelMapper behavior with lenient stubs
        lenient().when(modelMapper.map(any(Employee.class), eq(EmployeeDTO.class))).thenReturn(employeeDTO);
        lenient().when(modelMapper.map(any(EmployeeDTO.class), eq(Employee.class))).thenReturn(employee);
    }

    @Test
    void getAllEmployees() {
        when(employeeRepository.findAll()).thenReturn(Collections.singletonList(employee));

        List<EmployeeDTO> result = employeeService.getAllEmployees();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(employeeDTO, result.get(0));
        verify(employeeRepository, times(1)).findAll();
    }

    @Test
    void getEmployeeById() {
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));

        EmployeeDTO result = employeeService.getEmployeeById(1L);

        assertNotNull(result);
        assertEquals(employeeDTO, result);
        verify(employeeRepository, times(1)).findById(1L);
    }

    @Test
    void getEmployeeByIdNotFound() {
        when(employeeRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> employeeService.getEmployeeById(1L));
        verify(employeeRepository, times(1)).findById(1L);
    }

    @Test
    void createEmployee() {
        when(departmentRepository.findById(1L)).thenReturn(Optional.of(new Department()));
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        EmployeeDTO result = employeeService.createEmployee(employeeDTO);

        assertNotNull(result);
        assertEquals(employeeDTO, result);
        verify(employeeRepository, times(1)).save(any(Employee.class));
    }

    @Test
    void updateEmployee() {
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        when(departmentRepository.findById(1L)).thenReturn(Optional.of(new Department()));
        when(employeeRepository.save(any(Employee.class))).thenReturn(employee);

        EmployeeDTO result = employeeService.updateEmployee(1L, employeeDTO);

        assertNotNull(result);
        assertEquals(employeeDTO, result);
        verify(employeeRepository, times(1)).findById(1L);
        verify(employeeRepository, times(1)).save(any(Employee.class));
    }

    @Test
    void deleteEmployee() {
        when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        doNothing().when(employeeRepository).delete(any(Employee.class));

        employeeService.deleteEmployee(1L);

        verify(employeeRepository, times(1)).findById(1L);
        verify(employeeRepository, times(1)).delete(any(Employee.class));
    }
}