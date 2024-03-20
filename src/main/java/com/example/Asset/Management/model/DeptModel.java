package com.example.Asset.Management.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Department")
public class DeptModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long deptId;
    private String deptName;
}
