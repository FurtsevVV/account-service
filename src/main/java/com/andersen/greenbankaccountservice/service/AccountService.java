package com.andersen.greenbankaccountservice.service;

import com.andersen.greenbankaccountservice.entity.Account;
import com.andersen.greenbankaccountservice.entity.CardIdAccountDto;

import java.util.List;

public interface AccountService {

    CardIdAccountDto getUserDtoById(Long id);

    Account getAccountDetailsById(Long accountId);

    List<Account> getListOfUserAccounts(Long userId);
}
