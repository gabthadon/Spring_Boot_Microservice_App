package com.gabito.employee_service.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
public class DepartmentDto {

    private String name;
    private String address;
    private String code;
    private Long employeeId;

}
