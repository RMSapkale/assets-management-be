package com.example.Asset.Management.repository;

import com.example.Asset.Management.model.DeptModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
    public interface DeptRepository extends JpaRepository<DeptModel, Long> {

        Optional<DeptModel> findByDeptName(String deptName);
    }


