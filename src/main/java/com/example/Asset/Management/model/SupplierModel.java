package com.example.Asset.Management.model;

import com.example.Asset.Management.repository.SupplierRepository;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Supplier")

public class SupplierModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String supplierName;
    private String supplierAddress;
    private String lastUpdatedBy;
    private LocalDateTime lastUpdateDate;
    private String createdBy;
    private LocalDateTime createDate;
    private String programName;

//    public String saveAllSupplier(SupplierModel supplierModel) {
//        SupplierModel model= SupplierRepository.find
//    }
}

