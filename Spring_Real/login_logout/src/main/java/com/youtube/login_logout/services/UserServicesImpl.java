package com.youtube.login_logout.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.login_logout.entities.User;
import com.youtube.login_logout.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean registerUser(User user) {
        // TODO Auto-generated method stub

        // return false;
        try {
            userRepository.save(user);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User login(String email, String password) {
        // TODO Auto-generated method stub
        User validuser = userRepository.findByEmail(email);
        // throw new UnsupportedOperationException("Unimplemented method 'login'");
        if (validuser != null && validuser.getPassword().equals(password)) {
            return validuser;
        }
        return null;

    }

}
