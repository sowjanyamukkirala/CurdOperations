package com.my_group.service;

import com.my_group.model.UserLogin;
import com.my_group.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserLoginService
{
    @Autowired
    UserLoginRepository userLoginRepository;
    public List<UserLogin> getAll()
    {
        return userLoginRepository.findAll();
    }

    public Optional<UserLogin> findById(Long id){
        return userLoginRepository.findById(id);
    }
    public  UserLogin addUser(UserLogin userLogin)
    {
        return userLoginRepository.save(userLogin);

    }

}
