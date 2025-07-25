package com.gibito.department_service.controller;

import com.gibito.department_service.dto.DepartmentDto;
import com.gibito.department_service.model.Department;
import com.gibito.department_service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @PutMapping("/department/{id}")
    public void updateDepartment(  @PathVariable("id") Long id, @RequestBody Department department){
         departmentService.updateDepartment(department.getName(), department.getAddress(), department.getCode(), id);
    }
@GetMapping("/department/{employee_id}")
    public Department findByEmployeeId(@PathVariable("employee_id") Long employee_id){
        return departmentService.findByEmployeeId(employee_id);
}

@DeleteMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable("id") Long id){
      return   departmentService.deleteByEmployeeId(id);
}




}

