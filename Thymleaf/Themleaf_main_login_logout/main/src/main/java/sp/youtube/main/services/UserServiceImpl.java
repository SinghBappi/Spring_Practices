package sp.youtube.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sp.youtube.main.Repositorys.UserRepository;
import sp.youtube.main.entities.User;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean register(User user) {
        try {
            userRepository.save(user);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
//        return false;
    }

    @Override
    public User loginuser(String email, String password) {
        User validuser = userRepository.findByEmail(email);
        if (validuser!=null && validuser.getPassword().equals(password)){
            return validuser;
        }
        return null;
    }
}
