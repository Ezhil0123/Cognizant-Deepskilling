package main.java.com.example.oauth_login;

import java.security.Principal;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/")
    public String home() {
        return "Login Successful";
    }

    @GetMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}