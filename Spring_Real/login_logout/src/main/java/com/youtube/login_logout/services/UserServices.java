package com.youtube.login_logout.services;

import com.youtube.login_logout.entities.User;

public interface UserServices {
    public boolean registerUser(User user);
    public User login(String email, String string);
}
