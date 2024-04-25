package com.example.demo.controllers;

import com.example.demo.contracts.AuthenticationRequestDto;
import com.example.demo.contracts.AuthenticationResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @GetMapping("/authenticate")
    public ResponseEntity<AuthenticationResponseDto> login (
            @RequestBody @Validated AuthenticationRequestDto authenticationRequestDto
    ){

        return null;
    }
}
