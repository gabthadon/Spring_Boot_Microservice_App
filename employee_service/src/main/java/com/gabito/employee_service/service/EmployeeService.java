package com.gabito.employee_service.service;

import com.gabito.employee_service.config.DepartmentFeignClient;
import com.gabito.employee_service.dto.DepartmentDto;
import com.gabito.employee_service.dto.Request;
import com.gabito.employee_service.model.Employee;
import com.gabito.employee_service.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


//Fetch Related Records From Both Employee entity and Department Entity
    public Map<String, Object> findByEmployeeAndDepartmentId(Long id) {
    DepartmentDto dpt = departmentFeignClient.findByEmployeeId(id);
    Employee employee = employeeRepository.findById(id).get();

    Map<String, Object> relatedRecords = new HashMap<>();
    relatedRecords.put("department", dpt);
    relatedRecords.put("employee", employee);

    return relatedRecords;
    }

    @Transactional
    public String deleteEmployee(Long id) {
        String departmentDto = departmentFeignClient.deleteDepartment(id);
         employeeRepository.deleteById(id);

         return "Employee deleted";
    }
}
