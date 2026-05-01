package sp.youtube.main.services;

import sp.youtube.main.entities.User;

public interface UserService {
    public boolean register(User user);
    public User loginuser(String email,String password);
}
