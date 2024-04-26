package com.example.demo.controllers;

import com.example.demo.contracts.AuthenticationRequestDto;
import com.example.demo.contracts.AuthenticationResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponseDto> login (
            @RequestBody @Validated AuthenticationRequestDto authenticationRequestDto
    ){

        return null;
    }


    @GetMapping("/public-acces")
    public String publicAccesEndpoint(){
        return "Este EndPoint es público";
    }
}
