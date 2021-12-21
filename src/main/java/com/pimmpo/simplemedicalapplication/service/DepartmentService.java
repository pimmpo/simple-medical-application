package com.pimmpo.simplemedicalapplication.service;

import com.pimmpo.simplemedicalapplication.dto.request.DepartmentAddRequest;
import com.pimmpo.simplemedicalapplication.model.Department;
import com.pimmpo.simplemedicalapplication.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public void addDepartment(DepartmentAddRequest request) {
        Department department = new Department();
        department.setName(request.getName());
        departmentRepository.save(department);
    }

    public void deleteDepartment(long id) {
        departmentRepository.deleteById(id);
    }

    public Department getById(long id) {
        //todo: have look to getById and find different between findById
        return departmentRepository.findById(id).get();
    }
}
