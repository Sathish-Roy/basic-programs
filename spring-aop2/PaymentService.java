package com.example.springaopdemo;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void makePayment() {
        System.out.println("Processing Payment...");
    }

    public void refund() {
        System.out.println("Processing Refund...");
    }

    public void failedTransaction() {
        System.out.println("Processing Failed Transaction...");
        throw new RuntimeException("Transaction Failed!");
    }
}
