package com.example.demo.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long customerID;
    private Long accountId;
    private BigDecimal balance;
    private Long bitcoinBalance;
}
