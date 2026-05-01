package sp.youtube.main.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import sp.youtube.main.entities.User;
import sp.youtube.main.services.UserService;

@Controller
public class MyController {
    @Autowired
    private UserService userService;



    @GetMapping("regPage")
    public String openRegPage(Model model){
        model.addAttribute("user",new User());
        return "register";
    }



    @PostMapping("/regForm")
    public String submitForm(@ModelAttribute("user") User user , Model model){
        boolean status = userService.register(user);
        if (status)
        {
            model.addAttribute("successMsg","Success !");
        }
        else{
            model.addAttribute("ErrorMsg","Failed ");
        }
        return "register";
    }



    @GetMapping("/loginpage")
    public String openLoginPage(Model model){
        model.addAttribute("user",new User());
        return "login";

    }

    @PostMapping("/loginForm")
    public String submitloginform(@ModelAttribute("user") User user,Model model){

        User validuser = userService.loginuser(user.getEmail(), user.getPassword());
        if (validuser!=null)
        {
            model.addAttribute("modelname",validuser.getName());
            return "profile";

        }
        else{
            model.addAttribute("ErrorMsg","Go Fuck Yourself with Email id and Password !");

            return "login";
        }
//        return "";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        if(session!=null)
        {
            session.invalidate();
        }
        return "redirect:/loginpage";
    }
}
