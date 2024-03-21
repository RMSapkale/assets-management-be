package com.example.Asset.Management.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hrLogin")

public class HrModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private LocalDateTime lastUpdateDate;
    private LocalDateTime createDate;
    private String email;
    private String fullName;
    private String gender;
    private Long phoneNo;
}
