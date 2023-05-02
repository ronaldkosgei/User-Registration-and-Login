package com.User.Registration.and.Login.service;

import com.User.Registration.and.Login.dto.UserDto;
import com.User.Registration.and.Login.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}

