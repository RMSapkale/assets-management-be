package com.example.Asset.Management.repository;

import com.example.Asset.Management.Dto.LoginDto;
import com.example.Asset.Management.model.HrModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HrRepository extends JpaRepository<HrModel, Long> {
    HrModel findByEmailAndUserName(String email, String userName);

   HrModel findByEmail(String emailId);

//    LoginDto findByEmail(String email);
}
