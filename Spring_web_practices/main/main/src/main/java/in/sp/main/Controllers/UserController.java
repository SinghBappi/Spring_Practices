package in.sp.main.Controllers;

import in.sp.main.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private List<User> users = new ArrayList<>();

    @GetMapping()
    public List<User> getUser()
    {
//        users.add(user);
        return users;
    }
    @PostMapping()
    public User adduser(@RequestBody User user){
        users.add(user);
        return user;

    }
    @GetMapping("/{id}")
    public User getbyid(@PathVariable int id ){
        return users.get(id);
    }
}
