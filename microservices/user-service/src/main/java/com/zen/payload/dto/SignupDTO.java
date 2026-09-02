package com.zen.payload.dto;

import com.zen.domain.UserRole;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SignupDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserRole role;
    private String fullName;
}
