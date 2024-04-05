package com.example.Asset.Management.service;

import com.example.Asset.Management.Dto.LoginDto;
import com.example.Asset.Management.model.HrModel;
import com.example.Asset.Management.repository.HrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LoginService {
    @Autowired
    private HrRepository hrRepository;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public String userRegistration(HrModel hrModel) {
        HrModel model = hrRepository.findByEmailAndUserName(hrModel.getEmail(), hrModel.getUserName());
        if (model == null) {
            HrModel model1 = new HrModel();
            model1.setUserName(hrModel.getUserName());
            model1.setPassword(passwordEncoder().encode(hrModel.getPassword()));
            model1.setFullName(hrModel.getFullName());
            model1.setPhoneNo(hrModel.getPhoneNo());
            model1.setEmail(hrModel.getEmail());
            model1.setGender(hrModel.getGender());
            model1.setCreateDate(LocalDateTime.now());
            model1.setLastUpdateDate(LocalDateTime.now());
            model1.setLastUpdatedBy(hrModel.getEmail());
            model1.setCreatedBy(hrModel.getEmail());
            hrRepository.save(model1);
            return "Registration done  successfully";
        }
        return "Email_Id is already exits";
    }}

//    public String login(LoginDto loginDto) {
////        LoginDto model=hrRepository.findByEmail(loginDto.getEmail());
////        if(model!=null){
////
////            if (passwordEncoder().matches(loginDto.setPassword(passwordEncoder())
////                    model.getPassword()) || loginDto.getEmail()==){
////                return "Login successfully";
////            }else {
////                return "Please  ";
////
////            }
////        }


//        return null;
//  }
//}







