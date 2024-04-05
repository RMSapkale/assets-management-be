package com.example.Asset.Management.controller;

import com.example.Asset.Management.service.OtpVerifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/verifyEmail")
public class OtpVerifyController {

    @Autowired
    private OtpVerifyService otpVerifyService;

//    @PostMapping("/saveOtp")
//    public String saveOtp(@RequestParam String emailId) {
////        return otpVerifyService.saveOtp(emailId);
//    }

    @PostMapping()


    @GetMapping("/verifyOtp")
    public String verifyOtp(@RequestParam int otp, @RequestParam String emailId) {
        return otpVerifyService.verifyOtp(otp, emailId);
    }

    @GetMapping("/resetPassword")
    public String resetPassword(@RequestParam String emailId, @RequestParam String password) {
        return otpVerifyService.resetPassword(emailId, password);
    }



}
