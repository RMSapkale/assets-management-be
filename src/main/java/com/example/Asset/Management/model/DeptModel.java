package com.example.Asset.Management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Department")
public class DeptModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptId;
    private String deptName;
    private String LastUpdatedBy;
    private LocalDateTime lastUpdateDate;
    private String createdBy;
    private LocalDateTime createDate;
    private String programName;
}
