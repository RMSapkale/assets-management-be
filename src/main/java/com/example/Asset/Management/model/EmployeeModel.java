package com.example.Asset.Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
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
    private String emailId;
    private String password;
    private Long phoneNo;
    private Date hireDate;
    private Long assetId;
    private String LastUpdatedBy;
    private LocalDateTime lastUpdateDate;
    private String createdBy;
    private LocalDateTime createDate;
    private String programName;
}
