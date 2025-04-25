package com.app.service.imp;



import com.app.dto.DepartmentDTO;
import com.app.exception.ResourceNotFoundException;
import com.app.model.Department;
import com.app.repository.DepartmentRepository;
import com.app.service.DepartmentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	

    private final DepartmentRepository departmentRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository, ModelMapper modelMapper) {
        this.departmentRepository = departmentRepository;
        this.modelMapper = modelMapper;
        
     // Add this configuration
        this.modelMapper.getConfiguration()
            .setSkipNullEnabled(true)
            .setMatchingStrategy(MatchingStrategies.STRICT);
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        return departmentRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public DepartmentDTO getDepartmentById(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + id));
        return convertToDTO(department);
    }

    @Override
    public DepartmentDTO createDepartment(DepartmentDTO departmentDTO) {
        Department department = convertToEntity(departmentDTO);
        Department savedDepartment = departmentRepository.save(department);
        return convertToDTO(savedDepartment);
    }

    @Override
    public DepartmentDTO updateDepartment(Long id, DepartmentDTO departmentDTO) {
        Department existingDepartment = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + id));

        modelMapper.map(departmentDTO, existingDepartment);
        Department updatedDepartment = departmentRepository.save(existingDepartment);
        return convertToDTO(updatedDepartment);
    }

    @Override
    public void deleteDepartment(Long id) {
        Department department = departmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + id));
        departmentRepository.delete(department);
    }

    private DepartmentDTO convertToDTO(Department department) {
        return modelMapper.map(department, DepartmentDTO.class);
    }

    private Department convertToEntity(DepartmentDTO departmentDTO) {
        return modelMapper.map(departmentDTO, Department.class);
    }
}