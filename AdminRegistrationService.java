package com.my_group.service;

import com.my_group.model.AdminLogin;
import com.my_group.model.AdminRegistration;
import com.my_group.model.UserLogin;
import com.my_group.repository.AdminLoginRepository;
import com.my_group.repository.AdminRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminRegistrationService
{
    @Autowired
    AdminRegistrationRepository adminRegistrationRepository;
    public List<AdminRegistration> getAll()
    {
        return adminRegistrationRepository.findAll();
    }

    public Optional<AdminRegistration> findById(Long id){
        return adminRegistrationRepository.findById(id);
    }
    public  AdminRegistration addReg(AdminRegistration adminRegistration)
    {
        return adminRegistrationRepository.save(adminRegistration);

    }
    public AdminRegistration updatereg(AdminRegistration adminRegistration)
    {
        return adminRegistrationRepository.save(adminRegistration);
    }
}
