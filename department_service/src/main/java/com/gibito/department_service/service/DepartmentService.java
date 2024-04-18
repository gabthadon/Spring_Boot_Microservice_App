package com.gibito.department_service.service;

import com.gibito.department_service.model.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    void addDepartment(Department department);



    String updateDepartment(String name, String address, String code, Long id);

   Department findById(Long id);
}
