package sp.youtube.main.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.youtube.main.entities.User;

//import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>

{
    User findByEmail(String email);

}
