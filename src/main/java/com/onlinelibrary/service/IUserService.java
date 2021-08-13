package com.onlinelibrary.service;

import com.onlinelibrary.model.User;

import java.util.Optional;

public interface IUserService {

    User saveUser(User user);

    Optional<User> findByUsername(String user);

    void makeAdmin(String username);
}
