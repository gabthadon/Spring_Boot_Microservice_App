package com.gabito.employee_service.service;

import com.gabito.employee_service.config.DepartmentFeignClient;
import com.gabito.employee_service.dto.DepartmentDto;
import com.gabito.employee_service.model.Employee;
import com.gabito.employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentFeignClient departmentFeignClient;

    public void addEmployee(Employee employee) {
employeeRepository.save(employee);

        DepartmentDto departmentDto = new DepartmentDto();

departmentDto.setName("Mathematics");
departmentDto.setAddress("Block 10");
departmentDto.setCode("MTH-333");
departmentDto.setEmployeeId(employee.getId());

departmentFeignClient.addDepartment(departmentDto);

    }
}
