package com.example.daily_dictation.dto.response;

import java.time.LocalDate;
import java.util.Set;

public class UserResponse {
    String id;
    String username;
    String firstName;
    String lastName;
    LocalDate dob;
    Set<RoleResponse> roles;
}
