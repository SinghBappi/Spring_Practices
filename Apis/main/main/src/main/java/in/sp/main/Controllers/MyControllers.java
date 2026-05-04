package in.sp.main.Controllers;

import in.sp.main.Services.UserService;
import in.sp.main.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyControllers {


    //    @ResponseBody
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User addUserDetails(@RequestBody User user ){
        return userService.createUser(user);
    }


    @GetMapping("/user")
    public List<User> getAllUserDetails(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getallbyid(@PathVariable int id){
        User user =  userService.getById(id).orElse(null);
        if (user!=null)
        {
            return  ResponseEntity.ok().body(user);

        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUserDetails(@PathVariable int id,@RequestBody User user)
    {
        User updateduser = userService.updateUserDetails(id,user);

        if (updateduser!=null)
        {
            return ResponseEntity.ok(updateduser);

        }
        else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/user/{id}")
    public ResponseEntity<Void> deleteuser(@PathVariable int id){
        userService.deleteuserdetails(id);
        return ResponseEntity.noContent().build();
    }

}
