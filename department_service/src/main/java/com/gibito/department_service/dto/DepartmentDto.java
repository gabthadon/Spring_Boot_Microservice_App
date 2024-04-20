package com.gibito.department_service.dto;

import lombok.Data;

@Data
public class DepartmentDto {
    private String name;
    private String address;
    private String code;
    private Long employeeId;
}
