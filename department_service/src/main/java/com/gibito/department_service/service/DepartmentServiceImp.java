package com.gibito.department_service.service;

import com.gibito.department_service.model.Department;
import com.gibito.department_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements  DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

//Add Records to department table
    @Override
    public void addDepartment(Department department) {
departmentRepository.save(department);
    }
}
