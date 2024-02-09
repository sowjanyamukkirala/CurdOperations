package com.my_group.service;

import com.my_group.model.AdminLogin;
import com.my_group.model.UserLogin;
import com.my_group.repository.AdminLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminLoginService {
    @Autowired
    AdminLoginRepository adminLoginRepository;

    public List<AdminLogin> getAll() {
        return adminLoginRepository.findAll();
    }

    public Optional<AdminLogin> findById(Long id) {
        return adminLoginRepository.findById(id);
    }

    public AdminLogin addAdmin(AdminLogin adminLogin) {
        return adminLoginRepository.save(adminLogin);

    }

    public AdminLogin updateAdminLogin(AdminLogin adminLogin) {
        return adminLoginRepository.save(adminLogin);
    }
}

