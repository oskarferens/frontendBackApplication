package com.example.demo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Exchange {
    //RatesDto rates;
    private String base;
    private String date;
}
