package com.example.Asset.Management.service;

import com.example.Asset.Management.model.EmployeeModel;
import com.example.Asset.Management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public String saveEmployee(EmployeeModel employeeModel) {
        EmployeeModel model = employeeRepository.findByEmailIdAndPhoneNo(employeeModel.getEmailId(), employeeModel.getPhoneNo());
        if (model == null)
        {
            EmployeeModel model1 = new EmployeeModel();
            model1.setEmpName(employeeModel.getEmpName());
            model1.setDeptId(employeeModel.getDeptId());
            model1.setEmpDesignation(employeeModel.getEmpDesignation());
            model1.setHireDate(employeeModel.getHireDate());
            model1.setEmailId(employeeModel.getEmailId());
            model1.setPassword(passwordEncoder().encode(employeeModel.getPassword()));
            model1.setPhoneNo(employeeModel.getPhoneNo());
            model1.setAssetId(employeeModel.getAssetId());
            model1.setCreatedBy(employeeModel.getEmailId());
            model1.setLastUpdatedBy(employeeModel.getEmailId());
            model1.setCreateDate(LocalDateTime.now());
            model1.setLastUpdateDate(LocalDateTime.now());
            employeeRepository.save(model1);
            return "employee details save successfully";
        } else {

            return "This employee already exits";
        }
    }

    public Object getEmployeeById(Long id) {

        return employeeRepository.getById(id);
    }

}
