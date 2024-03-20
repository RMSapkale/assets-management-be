package com.example.Asset.Management.service;

import com.example.Asset.Management.model.EmployeeModel;
import com.example.Asset.Management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public String saveEmployee(EmployeeModel employeeModel) {
        EmployeeModel model = employeeRepository.findByMailIdAndPhoneNo(employeeModel.getMailId(),
                employeeModel.getPhoneNo());
        if(model==null)                         //for employee mail_id and phone_no not repeated
        {
            employeeRepository.save(employeeModel);
            return "employee details save successfully";
        }
        else
        {
            return "This employee already exits";
        }
    }

    public Object getemployeeById(Long id) {

        return employeeRepository.getById(id);
    }

}
