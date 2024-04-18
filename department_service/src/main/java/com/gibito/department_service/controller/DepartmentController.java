package com.gibito.department_service.controller;

import com.gibito.department_service.model.Department;
import com.gibito.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }
}
