package com.example.demo.client;

import com.example.demo.config.ConnectionConfig;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class BackendClient {

    private final RestTemplate restTemplate;
    private final ConnectionConfig connectionConfig;
    private static final Logger LOGGER = LoggerFactory.getLogger(BackendClient.class);

    public String getCustomerByName(String firstname) {
        Optional<String> response = Optional.ofNullable(restTemplate.getForObject
                (connectionConfig.getBackApiEndpoint() +
                        "/customer/getCustomerByName/" + firstname,String.class, String.class));
        return response.orElse(new String());
    }

    public BigDecimal getBalanceByAccountId(BigDecimal balance) {
        Optional<BigDecimal> balanceResponse = Optional.ofNullable(restTemplate.getForObject(
                connectionConfig.getBackApiEndpoint() +
                        "/account/getBalance/" + balance ,BigDecimal.class, BigDecimal.class));
        return balanceResponse.orElse(new BigDecimal(0));
    }

    public void makeTransfer() {

    }

    public void getOperationHistory() {

    }

    public void getBitcoinValue () {

    }

    public void getExchangeValues () {

    }


}
