package com.jamilxt.java_springboot_japserreport.controller;

import com.jamilxt.java_springboot_japserreport.model.transaction.Transaction;
import com.jamilxt.java_springboot_japserreport.service.transaction.TransactionService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "data")
public class DataAPI {

    private final TransactionService transactionService;

    public DataAPI(final TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, List<Transaction>> getListTransactions() {
        return Map.of("transactions", this.transactionService.getTransactionList());
    }
}
