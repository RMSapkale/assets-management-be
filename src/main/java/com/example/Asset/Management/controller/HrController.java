package com.example.Asset.Management.controller;

import com.example.Asset.Management.model.HrModel;
import com.example.Asset.Management.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hrLogin")
public class HrController {
    @Autowired
    private HrService hrService;

    @PostMapping("/user_registration")
    public String user_registration(@RequestBody HrModel hrModel)
    {
        if (hrModel.getUsername() == null && hrModel.getPassword() == null &&
                hrModel.getUsername().isBlank() &&
                hrModel.getPassword().isBlank())

        {
            return "pleased filled the valid details";
        }
        else
        {
               return hrService.user_registration(hrModel);
        }

    }

//@GetMapping("/getDetailsById")
//    public Object getDetailsById(@PathVariable Long id)
//{
//    return hrService.getDetailsById(id);
//}

}
