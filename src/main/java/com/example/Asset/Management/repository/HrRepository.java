package com.example.Asset.Management.repository;

import com.example.Asset.Management.model.EmployeeModel;
import com.example.Asset.Management.model.HrModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HrRepository extends JpaRepository<HrModel, Long>
{
    HrModel findByUsernameAndPassword(String username, String password);
}
