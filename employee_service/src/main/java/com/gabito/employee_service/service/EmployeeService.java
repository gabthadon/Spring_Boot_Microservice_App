package com.gabito.employee_service.service;

import com.gabito.employee_service.config.DepartmentFeignClient;
import com.gabito.employee_service.dto.DepartmentDto;
import com.gabito.employee_service.dto.Request;
import com.gabito.employee_service.model.Employee;
import com.gabito.employee_service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentFeignClient departmentFeignClient;

    public void addEmployee(Request request) {

Employee emp = new Employee();

emp.setName(request.getEmployeeName());
emp.setAddress(request.getEmployeeAddress());
emp.setEmail(request.getEmployeeEmail());

employeeRepository.save(emp);

        DepartmentDto departmentDto = new DepartmentDto();

departmentDto.setEmployeeId(emp.getId());
departmentDto.setName(request.getDepartmentName());
departmentDto.setAddress(request.getDepartmentAddress());
departmentDto.setCode(request.getDepartmentCode());

departmentFeignClient.addDepartment(departmentDto);

    }
}
