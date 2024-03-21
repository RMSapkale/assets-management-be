package com.example.Asset.Management.service;

import com.example.Asset.Management.model.HrModel;
import com.example.Asset.Management.repository.HrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class HrService {
    @Autowired
    private HrRepository hrRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public String user_registration(HrModel hrModel) {

        HrModel model=new HrModel();
        model.setUsername(hrModel.getUsername());
        model.setPassword(hrModel.getPassword());
        model.setFullName(hrModel.getFullName());
        model.setPhoneNo(hrModel.getPhoneNo());
        model.setEmail(hrModel.getEmail());
        model.setGender(hrModel.getGender());
        model.setCreateDate(LocalDateTime.now());
        model.setLastUpdateDate(LocalDateTime.now());
        hrRepository.save(model);
        return "Login details save successfully";
    }


}
