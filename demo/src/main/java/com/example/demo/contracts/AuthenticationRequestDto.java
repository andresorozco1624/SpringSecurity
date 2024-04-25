package com.example.demo.contracts;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AuthenticationRequestDto {
    private String username;
    private String password;
}
