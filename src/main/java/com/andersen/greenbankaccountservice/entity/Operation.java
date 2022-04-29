package com.andersen.greenbankaccountservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long operationId;
    private Long senderAccountId;
    private Long receiverAccountId;
    private BigDecimal operationSum;
    private LocalDateTime operationDateTime;
    private OperationStatus operationStatus;
    private String comment;
}
