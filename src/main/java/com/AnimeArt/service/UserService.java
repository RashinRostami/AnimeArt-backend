package com.AnimeArt.service;

import com.AnimeArt.entity.UserEntity;

import java.util.Optional;

public interface UserService {
    UserEntity registerUser(UserEntity user);

    Optional<UserEntity> login(String username, String password);
}
