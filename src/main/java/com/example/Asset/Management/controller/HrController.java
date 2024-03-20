package com.example.Asset.Management.controller;

import com.example.Asset.Management.model.HrModel;
import com.example.Asset.Management.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.net.PasswordAuthentication;

@RestController
@RequestMapping("/hrLogin")
public class HrController
{
    @Autowired
    private HrService hrService;





    @PostMapping("/saveLoginDetails")
    public String saveLoginDetails(@RequestBody HrModel hrModel)
    {
        return hrService.savelogin(hrModel);
    }

//@GetMapping("/getDetailsById")
//    public Object getDetailsById(@PathVariable Long id)
//{
//    return hrService.getDetailsById(id);
//}

}
