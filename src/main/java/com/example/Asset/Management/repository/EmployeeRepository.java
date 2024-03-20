package com.example.Asset.Management.repository;

import com.example.Asset.Management.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>
{

    EmployeeModel findByMailIdAndPhoneNo(String mailId, Long phoneNo);
}
