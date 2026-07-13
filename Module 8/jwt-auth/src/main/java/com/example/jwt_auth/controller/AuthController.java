package com.example.jwt_auth.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt_auth.model.LoginRequest;
import com.example.jwt_auth.security.JwtService;

@RestController
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public Map<String, String> login(
            @RequestBody LoginRequest request) {

        // Dummy authentication
        if ("admin".equals(request.getUsername())
                && "admin123".equals(request.getPassword())) {

            String token =
                    jwtService.generateToken(request.getUsername());

            return Map.of("token", token);
        }

        throw new RuntimeException("Invalid credentials");
    }

    @GetMapping("/secure")
    public String secure() {
        return "JWT Authentication Successful";
    }
}