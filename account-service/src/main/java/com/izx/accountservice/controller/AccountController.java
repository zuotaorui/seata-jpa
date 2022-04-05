package com.izx.accountservice.controller;

import com.izx.accountservice.entity.Account;
import com.izx.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/debit")
    public Boolean debit(String userId, BigDecimal money) {
        accountService.debit(userId, money);

        return true;
    }

    @GetMapping
    public List<Account> findAll(){
        return accountService.findAll();
    }

}
