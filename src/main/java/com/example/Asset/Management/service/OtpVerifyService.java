package com.example.Asset.Management.service;

import com.example.Asset.Management.model.HrModel;
import com.example.Asset.Management.model.OtpVerifyModel;
import com.example.Asset.Management.repository.HrRepository;
import com.example.Asset.Management.repository.OtpVerifyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class OtpVerifyService {
    @Autowired
    private HrRepository hrRepository;
    @Autowired
    private OtpVerifyRepository otpVerifyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String getOtpLoginEmailTemplate(String name, String email, String otp) {
        return null;
    }

    public String verifyOtp(int otp, String emailId) {
        OtpVerifyModel model = otpVerifyRepository.findByEmailId(emailId);
        if (model != null) {
            if (model.getOtp() == otp) {
                model.setLastUpdateDate(LocalDateTime.now());
                model.setCreateDate(LocalDateTime.now());
                model.setCreatedBy(emailId);
                model.setLastUpdatedBy(emailId);
                otpVerifyRepository.save(model);
                return "OTP verify successfully";
            } else {
                return "Invalid OTP";
            }
        } else {
            return " Please Provide valid Email";
        }

    }

    public String resetPassword(String emailId, String password) {
        HrModel model = hrRepository.findByEmail(emailId);
        if (model != null) {
            model.setLastUpdateDate(LocalDateTime.now());
            model.setCreateDate(LocalDateTime.now());
            model.setLastUpdatedBy(emailId);
            model.setCreatedBy(emailId);
            model.setPassword(passwordEncoder.encode(password));
            hrRepository.save(model);
            return "Password update successfully";
        }
        return "Please provide valid details";
    }
}
//        });
//    }
//
//    String generateOTP(String emailId) {
//        return null;
//    }
//
//    CompletableFuture<Boolean> sendOTPByEmail(String email, String otp) {
//        return null;
//    }
//
//    boolean validateOTP(String email, String otp) {
//        return false;
//    }
//
//
//    public String saveOtp(String emailId) {
//        System.out.println(generateOTP());
//        OtpVerifyModel otpVerifyModel = otpVerifyRepository.findByEmailId(emailId);
//        if (otpVerifyModel == null)
//        {
//            otpVerifyModel = new OtpVerifyModel();
//            otpVerifyModel.setEmailId(emailId);
//        }
//        otpVerifyModel.setOtp(generateOTP());
//        otpVerifyRepository.save(otpVerifyModel);
//        return "email save successfully";
//    }
//
//    public CompletableFuture<Boolean> sendOTPByEmail(String email, String name, String otp) {
//        // Compose the email content
//        String subject = "OTP Verification";
//        String emailText = getOtpLoginEmailTemplate(name, "xxx" + email.substring(3), otp);
//
//        CompletableFuture<Void> emailSendingFuture = sendEmail(email, subject, emailText);
//
//        return emailSendingFuture.thenApplyAsync(result -> true)
//                .exceptionally(ex -> {
//                    ex.printStackTrace();
//                    return false;
//                });
//    }
//
//    private CompletableFuture<Void> sendEmail(String email, String subject, String emailText) {
//
//    }
//
//    public int generateOTP() {
//        Random random = new Random();
//        int otp = 100000 + random.nextInt(900000);
//        return otp;
//    }
//
////    public Object getOtp() {
////        return otpVerifyRepository.findAll();
////    }
//}


