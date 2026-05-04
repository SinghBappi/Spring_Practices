package in.sp.main.Services;

import in.sp.main.Repository.UserRepo;
import in.sp.main.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user) {

        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> getById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public User updateUserDetails(int id, User user) {
        User userdata = userRepo.findById(id).orElse(null);
        if (userdata != null) {
            return userRepo.save(user);
        } else {



         throw new RuntimeException("User not found with id " + id);
    }

    }

    @Override
    public void deleteuserdetails(int id) {
        userRepo.deleteById(id);
    }
}
