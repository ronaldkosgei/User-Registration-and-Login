package com.User.Registration.and.Login.repository;


import com.User.Registration.and.Login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
