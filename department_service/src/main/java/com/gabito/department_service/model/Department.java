package com.gabito.department_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Table(name="department")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @GeneratedValue(strategy = GenerationType.AUTO)

    @Id
    private Long id;
    private String name;
    private String address;
    private String code;

}
