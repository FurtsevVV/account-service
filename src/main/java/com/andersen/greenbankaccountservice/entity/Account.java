package com.andersen.greenbankaccountservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long accountId;
    private Long userId;
    private String accountNumber;
    private BigDecimal balance;
    private LocalDateTime creationDate;
    private AccountStatus accountStatus;
}
