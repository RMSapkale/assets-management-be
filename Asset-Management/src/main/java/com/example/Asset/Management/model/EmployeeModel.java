package com.example.Asset.Management.model;

import lombok.*;
import jakarta.persistence.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")

public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String empName;
    private String empDesignation;
    private Long deptId;
    private String mailId;
    private Long phoneNo;
    private Date hireDate;
    private Long assetId;
}
