package com.example.Asset.Management.controller;

import com.example.Asset.Management.model.DeptModel;
import com.example.Asset.Management.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")

public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/savedept")
            public String savedept(@RequestBody List<DeptModel> deptModel)
    {
        return deptService.savedept(deptModel);
    }
}
