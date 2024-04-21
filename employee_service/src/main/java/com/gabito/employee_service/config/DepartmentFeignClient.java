package com.gabito.employee_service.config;

import com.gabito.employee_service.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="department-service")
public interface DepartmentFeignClient {

    @PostMapping("/department")
     void addDepartment(@RequestBody DepartmentDto department);

    @GetMapping("/department/{employee_id}")
     DepartmentDto findByEmployeeId(@PathVariable("employee_id") Long employee_id);

}

