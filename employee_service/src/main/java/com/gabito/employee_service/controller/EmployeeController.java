package com.gabito.employee_service.controller;

import com.gabito.employee_service.config.DepartmentFeignClient;
import com.gabito.employee_service.dto.Request;
import com.gabito.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentFeignClient departmentFeignClient;

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Request request){
employeeService.addEmployee(request);
    }
}
