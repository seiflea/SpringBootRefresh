package com.springrefresh.refresh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

@RestController
public class MainController {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}