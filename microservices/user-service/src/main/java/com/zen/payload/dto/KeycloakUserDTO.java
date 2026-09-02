package com.zen.payload.dto;

import lombok.Data;

@Data
public class KeycloakUserDTO {
    private  String id;
    private String firstname;
    private String lastName;
    private String email;
    private String username;


}
