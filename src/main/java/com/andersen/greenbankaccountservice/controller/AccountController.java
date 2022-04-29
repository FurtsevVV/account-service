package com.andersen.greenbankaccountservice.controller;

import com.andersen.greenbankaccountservice.entity.Account;
import com.andersen.greenbankaccountservice.entity.CardIdAccountDto;
import com.andersen.greenbankaccountservice.service.AccountServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountServiceImpl accountService;

    @GetMapping("/{id}")
    public CardIdAccountDto getUserCardDto(@PathVariable Long id) {
        return accountService.getUserDtoById(id);
    }

    @GetMapping("/account/{accountId}")
    public Account getAccountDetailsById(@PathVariable Long accountId){
       return accountService.getAccountDetailsById(accountId);
    }

    @GetMapping("/user/{userId}")
    public List<Account> getListOfUserAccounts(@PathVariable Long userId){
        return accountService.getListOfUserAccounts(userId);
    }
}
