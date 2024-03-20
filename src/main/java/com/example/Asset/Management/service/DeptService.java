package com.example.Asset.Management.service;

import com.example.Asset.Management.model.DeptModel;
import com.example.Asset.Management.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    private DeptRepository deptRepository;

    public String savedept(List<DeptModel> deptModel)
    {
        for(DeptModel record:deptModel)
        {
            DeptModel model=new DeptModel();
            model.setDeptName(record.getDeptName());
            deptRepository.save(record);
        }
//        DeptModel model=new DeptModel();
//        model.setDeptName(deptModel.getDeptName());
//        deptRepository.save(deptModel);
        return "Department name save successfully";
    }
}
