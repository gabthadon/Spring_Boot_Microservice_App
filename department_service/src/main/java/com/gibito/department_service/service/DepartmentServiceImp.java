package com.gibito.department_service.service;

import com.gibito.department_service.model.Department;
import com.gibito.department_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImp implements  DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

//Add Records to department table
    @Override
    public void addDepartment(Department department) {
departmentRepository.save(department);
    }

    @Override
    public String updateDepartment(String name, String address, String code, Long id) {
        departmentRepository.updateById(name, address, code, id);
        return "RECORD UPDATED";
    }

    @Override
    public Department findById(Long id) {
      return departmentRepository.findById(id).get();

    }


}
