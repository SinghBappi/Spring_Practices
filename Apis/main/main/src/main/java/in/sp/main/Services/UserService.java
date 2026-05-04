package in.sp.main.Services;

import in.sp.main.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User createUser(User user);
    public List<User> getAllUsers();
    public Optional<User> getById(int id);
    public User updateUserDetails(int id,User user);
    public void deleteuserdetails(int id);
}
