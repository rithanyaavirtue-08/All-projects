package com.zen.payload.response;

import lombok.Data;
import com.zen.domain.UserRole;

@Data
public class AuthResponse {
    private String jwt;
    private String refresh_token;
    private String message;
    private String title;
    private UserRole role;

}
