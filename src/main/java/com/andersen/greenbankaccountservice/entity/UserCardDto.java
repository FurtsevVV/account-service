package com.andersen.greenbankaccountservice.entity;


import com.andersen.greenbankaccountservice.entity.usercarddtoenums.CardStatus;
import com.andersen.greenbankaccountservice.entity.usercarddtoenums.CardType;
import com.andersen.greenbankaccountservice.entity.usercarddtoenums.Currency;
import com.andersen.greenbankaccountservice.entity.usercarddtoenums.PaymantSystem;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class UserCardDto {

    private Long userId;
    private Long cardId;
    private CardType cardType;
    private PaymantSystem paymantSystem;
    private LocalDateTime validationPeriodDate;
    private String cardNumber;
    private BigDecimal balance;
    private Currency currency;
    private CardStatus cardStatus;
}
