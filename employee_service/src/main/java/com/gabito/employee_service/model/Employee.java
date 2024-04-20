package com.gabito.employee_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private Long id;
    private String name;
    private String address;
    @Column(unique = true)
    private String email;
}
