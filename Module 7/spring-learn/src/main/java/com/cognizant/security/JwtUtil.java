package com.cognizant.security;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {

    private static final String SECRET =
            "mysupersecretkeymysupersecretkey";

    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(
                        new Date(
                                System.currentTimeMillis()
                                        + 1000 * 60 * 60))
                .signWith(
                        SignatureAlgorithm.HS512,
                        SECRET)
                .compact();
    }

    public String extractUsername(
            String token) {

        Claims claims =
                Jwts.parser()
                        .setSigningKey(SECRET)
                        .parseClaimsJws(token)
                        .getBody();

        return claims.getSubject();
    }

    public boolean validateToken(
            String token) {

        try {

            Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token);

            return true;

        } catch (Exception e) {
            return false;
        }
    }
}