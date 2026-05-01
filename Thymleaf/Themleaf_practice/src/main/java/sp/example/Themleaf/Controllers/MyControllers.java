package sp.example.Themleaf.Controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyControllers {

    @GetMapping("/profile")
public String openProfilePage(Model model){
        String name = "Bappi";
        model.addAttribute("Modelname",name);

    return "profile";
}
@GetMapping("/openCond")
    public  String opencondition(Model model){
        int n1 = 10;
        int n2 = 20;
        model.addAttribute("n1",n1);
    model.addAttribute("n2",n2);

    return "conditional";
}
    @GetMapping("/openLooping")
    public String openloopingpage(Model model){
        List<Integer> numbers = List.of(1,2,3,4,5);
        model.addAttribute("modelnum",numbers);

        return "looping";
    }

}
