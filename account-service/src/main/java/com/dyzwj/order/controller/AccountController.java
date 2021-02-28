package com.dyzwj.order.controller;

import com.dyzwj.order.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;


    @PostMapping("/account")
    public String insertAccount(){
        accountService.insertAccount();
        return "account";
    }







}
