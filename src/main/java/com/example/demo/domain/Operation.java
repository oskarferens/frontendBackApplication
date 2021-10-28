package com.example.demo.domain;

import lombok.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    private Long operationId;
    private BigDecimal value;
    private double internationalTransfer;
    private double transfer;
    private boolean operationComplete;
}
