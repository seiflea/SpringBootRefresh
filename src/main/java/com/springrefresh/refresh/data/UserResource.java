package com.springrefresh.refresh.data;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class UserResource {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
}
