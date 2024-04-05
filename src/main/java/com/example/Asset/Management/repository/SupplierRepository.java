package com.example.Asset.Management.repository;

import com.example.Asset.Management.model.SupplierModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository  extends JpaRepository <SupplierModel, Long>
{

}
