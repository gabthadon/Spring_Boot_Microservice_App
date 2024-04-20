package com.gibito.department_service.service;

import com.gibito.department_service.dto.DepartmentDto;
import com.gibito.department_service.model.Department;
import com.gibito.department_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

//Add Records to department table

    public void addDepartment(Department department) {


        departmentRepository.save(department);
    }


    public String updateDepartment(String name, String address, String code, Long id) {
        departmentRepository.updateById(name, address, code, id);
        return "RECORD UPDATED";
    }


    public Department findById(Long id) {
      return departmentRepository.findById(id).get();

    }


}
