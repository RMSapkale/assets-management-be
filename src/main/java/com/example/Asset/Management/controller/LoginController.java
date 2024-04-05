package com.example.Asset.Management.controller;

import com.example.Asset.Management.Dto.LoginDto;
import com.example.Asset.Management.model.HrModel;
import com.example.Asset.Management.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/userRegistration")
    public String userRegistration(@RequestBody HrModel hrModel) {
        if (hrModel.getUserName().equals(null) || hrModel.getUserName().equals("") || hrModel.getPassword().equals(null) || hrModel.getPassword().equals("")) {
            return "pleased filled the valid details";
        } else {
            return loginService.userRegistration(hrModel);
        }
    }

//    @PostMapping("/login")
//    public String Login(@RequestBody LoginDto  loginDto) {
//        if (loginDto.getEmail() == null || loginDto.getPassword() == null) {
//            return "please filled the valid details";
//        } else {
////            ResponseEntity.status(HttpStatus.CREATED).body(loginDto);
//            return loginService.login(loginDto);
//        }



    }




