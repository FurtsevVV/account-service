package com.andersen.greenbankaccountservice.service;

import com.andersen.greenbankaccountservice.entity.Account;
import com.andersen.greenbankaccountservice.entity.CardIdAccountDto;
import com.andersen.greenbankaccountservice.repository.AccountRepository;
import com.andersen.greenbankaccountservice.repository.OperationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final OperationRepository operationRepository;
    private final WebClientAccountService webClientAccountService;

    public CardIdAccountDto getUserDtoById(Long id) {
        CardIdAccountDto userCardDto = webClientAccountService.getUserCardDtoByCardIdAsync(id.toString());
        log.info("CardIdAccountDto: " + userCardDto);
        return userCardDto;
    }

    @Override
    public Account getAccountDetailsById(Long accountId) {
        return accountRepository.getById(accountId);
    }

    @Override
    public List<Account> getListOfUserAccounts(Long userId) {
        List<Account> accountList = accountRepository.findAccountsByUserId(userId);
        log.info("getListOfUserAccounts() find Account entity: " + accountList.size());
        return accountList;
    }
}
