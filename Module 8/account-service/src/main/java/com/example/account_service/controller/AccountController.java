package com.example.account_service.controller;

import org.springframework.web.bind.annotation.*;

import com.example.account_service.model.Account;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(
            @PathVariable String number) {

        return new Account(
                number,
                "Savings",
                234343
        );
    }
}