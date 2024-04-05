package com.example.Asset.Management.Dto;

import com.example.Asset.Management.model.EmployeeModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Data

public class AssignAssetsToEmployeeDto {

    private Date assignDate;
    private Long assetsId;
    private Long employeeId;
    private String LastUpdatedBy;
    private LocalDateTime lastUpdateDate;
    private String createdBy;
    private LocalDateTime createDate;
    private String programName;
}
