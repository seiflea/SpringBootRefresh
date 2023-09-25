package com.springrefresh.refresh;

import com.springrefresh.refresh.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public UserService createUserService() {
        UserService service = new UserService();
        return service;
    }
}
