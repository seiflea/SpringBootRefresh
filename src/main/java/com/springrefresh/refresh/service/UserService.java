package com.springrefresh.refresh.service;


import com.springrefresh.refresh.data.UserEntity;
import com.springrefresh.refresh.data.UserResource;
import com.springrefresh.refresh.database.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.StreamSupport;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserResource> getAllUsers() {
        return StreamSupport.stream(
                        userRepository.findAll().spliterator(),
                        false)
                .map(this::convertEntityToResource)
                .toList();
    }

    private UserResource convertEntityToResource(UserEntity entity) {
        return new UserResource(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getBirthday(),
                entity.getEmail());
    }
}
