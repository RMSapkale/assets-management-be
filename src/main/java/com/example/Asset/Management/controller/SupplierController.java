package com.example.Asset.Management.controller;

import com.example.Asset.Management.model.SupplierModel;
import com.example.Asset.Management.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/saveAllSupplier")
    public String saveAllSupplier(@RequestMapping SupplierModel supplierModel){
        return supplierModel.saveAllSupplier(supplierModel);
    }
}
