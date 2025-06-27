package com.example.springaopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopDemoApplication implements CommandLineRunner {

    @Autowired
    private PaymentService paymentService;

    public static void main(String[] args) {  // 👉 This is the main method
        SpringApplication.run(SpringAopDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        paymentService.makePayment();
        paymentService.refund();
        try {
            paymentService.failedTransaction();
        } catch (Exception e) {
            // Exception will be caught by AfterThrowing advice
        }
    }
}
