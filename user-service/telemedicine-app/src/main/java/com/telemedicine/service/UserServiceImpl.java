package com.telemedicine.service;



import com.telemedicine.config.JwtProvider;
import com.telemedicine.model.User;
import com.telemedicine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User getUserProfile(String jwt) {

        String email = JwtProvider.getEmailFromJwtToken(jwt);
        return userRepository.findByEmail(email);

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}