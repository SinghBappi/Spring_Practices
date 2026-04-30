package com.youtube.login_logout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube.login_logout.entities.User;
// import java.util.List;


// import io.micrometer.core.instrument.Meter.Id;

public interface UserRepository extends JpaRepository<User,Integer>{
     User findByEmail(String email);
}
