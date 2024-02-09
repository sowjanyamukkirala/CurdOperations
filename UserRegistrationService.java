package com.my_group.service;

import com.my_group.model.AdminLogin;
import com.my_group.model.UserLogin;
import com.my_group.model.UserRegistration;
import com.my_group.repository.AdminLoginRepository;
import com.my_group.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserRegistrationService
{
    @Autowired
    UserRegistrationRepository userRegistrationRepository;
    public List<UserRegistration> getAll()
    {
        return userRegistrationRepository.findAll();
    }

    public Optional<UserRegistration> findById(Long id){
        return userRegistrationRepository.findById(id);
    }
    public  UserRegistration addUserReg(UserRegistration userRegistration)
    {
        return userRegistrationRepository.save(userRegistration);

    }
}
