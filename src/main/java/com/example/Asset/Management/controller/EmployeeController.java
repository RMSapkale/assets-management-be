package com.example.Asset.Management.controller;

import com.example.Asset.Management.model.EmployeeModel;
import com.example.Asset.Management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/saveEmployee")
    public String SaveEmployee(@RequestBody EmployeeModel employeeModel)
    {
    return employeeService.saveEmployee(employeeModel);
    }
    @GetMapping("/getEmployeeById/{id}")
        public Object getEmployeeById (@PathVariable Long id)
    {
        return employeeService.getEmployeeById(id);
    }







}
