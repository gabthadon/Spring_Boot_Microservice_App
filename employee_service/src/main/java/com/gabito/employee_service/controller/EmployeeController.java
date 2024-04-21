package com.gabito.employee_service.controller;

import com.gabito.employee_service.config.DepartmentFeignClient;
import com.gabito.employee_service.dto.Request;
import com.gabito.employee_service.model.Employee;
import com.gabito.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @GetMapping("/employee/{id}")
    public Map<String, Object> getEmployee(@PathVariable("id") Long id){
       return employeeService.findByEmployeeAndDepartmentId(id);
    }
}
