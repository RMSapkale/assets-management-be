package com.example.Asset.Management.model;

import lombok.*;
import jakarta.persistence.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="assets")
public class AssetsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String assetName;
    private String assetModel;
    private Long assetQuantity;
    private Date lastupdatedate;
    private Date createdate;
}
