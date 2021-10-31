package com.example.demo.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionHistory {
    private String to;
    private BigDecimal value;
    private Date date;
}
