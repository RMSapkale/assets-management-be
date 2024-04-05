package com.example.Asset.Management.repository;

import com.example.Asset.Management.model.OtpVerifyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpVerifyRepository extends JpaRepository<OtpVerifyModel, Long> {
    OtpVerifyModel findByEmailId(String email);
}
