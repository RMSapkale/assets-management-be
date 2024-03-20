package com.example.Asset.Management.service;

import com.example.Asset.Management.model.AssetsModel;
import com.example.Asset.Management.model.HrModel;
import com.example.Asset.Management.repository.HrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class HrService {
    @Autowired
    private HrRepository hrRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public String savelogin(HrModel hrModel) {
        System.out.println(hrModel.getPassword()+ "  " +passwordEncoder().encode(hrModel.getPassword()));
        HrModel model1 = hrRepository.findByUsernameAndPassword(hrModel.getUsername(), hrModel.getPassword());
        if (model1 != null)
        {                                                                 // for validate username and password
            if (Objects.equals(model1.getUsername(), hrModel.getUsername()) &&
                    Objects.equals(model1.getPassword(), hrModel.getPassword()))
            {
                passwordEncoder().encode(hrModel.getPassword());
                return "successfully Login ";
            }
            else
            {
                return "failed to login";
            }
        }
           else
        {
            return "Invalid Details";
        }

    }

//    public String passwordencrypted(HrModel hrModel) {
//
//    }
}
