package com.example.Asset.Management.service;

import com.example.Asset.Management.model.DeptModel;
import com.example.Asset.Management.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class DeptService {
    @Autowired
    private DeptRepository deptRepository;

    public String saveDepartment(List<DeptModel> deptModel) {
        for (DeptModel record : deptModel)
        {
            DeptModel model1;
            Optional<DeptModel> model = deptRepository.findByDeptName(record.getDeptName());
            model1 = model.orElseGet(DeptModel::new);
            model1.setDeptName(record.getDeptName());
            model1.setLastUpdatedBy(record.getDeptName());
            model1.setLastUpdateDate(LocalDateTime.now());
            model1.setCreatedBy(record.getDeptName());
            model1.setCreateDate(LocalDateTime.now());
            deptRepository.save(model1);
        }
        return "Department name save successfully";
    }
}
