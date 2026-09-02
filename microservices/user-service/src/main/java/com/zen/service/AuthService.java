package com.zen.service;

import com.zen.payload.dto.SignupDTO;
import com.zen.payload.response.AuthResponse;

public interface AuthService {
  AuthResponse login(String username, String password) throws Exception;
  AuthResponse signup(SignupDTO req) throws Exception;
  AuthResponse getAccessTokenFromRefreshToken(String refreshToken) throws Exception;


}
