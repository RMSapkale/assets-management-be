package com.example.Asset.Management.repository;

import com.example.Asset.Management.model.AssetsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository extends JpaRepository<AssetsModel, Long> {

}
