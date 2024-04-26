package com.dacm.hexagonal.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Users {

    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String role;

}
