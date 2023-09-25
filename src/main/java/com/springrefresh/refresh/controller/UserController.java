package com.springrefresh.refresh.controller;

import com.springrefresh.refresh.data.UserResource;
import com.springrefresh.refresh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public List<UserResource> getAllUsers() {
        return service.getAllUsers();
    }


}
