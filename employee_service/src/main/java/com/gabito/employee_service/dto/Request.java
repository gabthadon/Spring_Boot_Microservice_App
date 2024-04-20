package com.gabito.employee_service.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Request {

    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    private String employeeName;
    private String employeeAddress;
    private String employeeEmail;
}
