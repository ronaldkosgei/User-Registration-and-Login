package com.User.Registration.and.Login.repository;

import com.User.Registration.and.Login.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
