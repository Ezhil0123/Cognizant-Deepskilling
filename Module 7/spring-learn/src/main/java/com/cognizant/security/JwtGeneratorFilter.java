package com.cognizant.security;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtGeneratorFilter
        extends BasicAuthenticationFilter {

    public JwtGeneratorFilter(
            AuthenticationManager authenticationManager) {

        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        Authentication authentication =
                org.springframework.security.core.context
                        .SecurityContextHolder
                        .getContext()
                        .getAuthentication();

        if (authentication != null) {

            String token =
                    Jwts.builder()
                            .setSubject(
                                    authentication.getName())
                            .setExpiration(
                                    new Date(
                                            System.currentTimeMillis()
                                                    + 600000))
                            .signWith(
                                    SignatureAlgorithm.HS512,
                                    SecurityConstants.SECRET)
                            .compact();

            response.addHeader(
                    SecurityConstants.HEADER_STRING,
                    SecurityConstants.TOKEN_PREFIX + token);
        }

        chain.doFilter(request, response);
    }
}