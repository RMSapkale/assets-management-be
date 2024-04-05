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
@Table(name = "assets")
public class AssetsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String assetName;
    private String assetModel;
    private Long assetQuantity;
    private String lastUpdatedBy;
    private LocalDateTime lastUpdateDate;
    private String createdBy;
    private LocalDateTime createDate;
    private String programName;
}
