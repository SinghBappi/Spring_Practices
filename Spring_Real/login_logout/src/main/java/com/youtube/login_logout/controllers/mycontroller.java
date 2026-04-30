package com.youtube.login_logout.controllers;

import com.youtube.login_logout.services.UserServicesImpl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.youtube.login_logout.entities.User;
import com.youtube.login_logout.services.UserServices;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class mycontroller {
    private final UserServicesImpl userServicesImpl;
    @Autowired
    private UserServices UserServices;

    mycontroller(UserServicesImpl userServicesImpl) {
        this.userServicesImpl = userServicesImpl;
    }

    @GetMapping("/regpage")
    public String openRegPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/regform")
    public String submitRegForm(@ModelAttribute("user") User user, Model model) {
        // TODO: process POST request
        boolean status = UserServices.registerUser(user);
        if (status) {
            model.addAttribute("successMsg", "User Registered Successfully");
            
        }
        
        else{
            model.addAttribute("errorMsg", "User Not Registered !");
            
        }
        
        return "register";
        
    }
    
    @GetMapping("/loginPage")
    public String openLoginPage(Model model) {
        model.addAttribute("user",new User());
        return "login";
    }
    @PostMapping("/loginform")
    public String submitLoginForm(@ModelAttribute("user") User user,Model model) {
        //TODO: process POST request
        User validuser = UserServices.login(user.getEmail(),user.getPassword());
        
        // return entity;
        if (validuser!=null) {
            model.addAttribute("modelname",validuser.getName());
            return "profile";
        }
        else{
            model.addAttribute("errorMsg", "Email id and password did not Match !");
            return "login";
            
        }
        // return "";
    }
    @GetMapping("/logout")
    public String logouString(HttpServletRequest req) {
        HttpSession session = req.getSession(false);
        // return new String();
        if (session!=null) {
            session.invalidate();
        }
        return "login";
    }
    
    
    
}
