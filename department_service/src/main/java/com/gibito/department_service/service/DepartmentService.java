package com.gibito.department_service.service;

import com.gibito.department_service.model.Department;

public interface DepartmentService {
    void addDepartment(Department department);



    String updateDepartment(String name, String address, String code, Long id);
}
