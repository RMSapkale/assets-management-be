package com.example.Asset.Management.repository;

import com.example.Asset.Management.model.DeptModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface DeptRepository extends JpaRepository<DeptModel, Long> {

    }


