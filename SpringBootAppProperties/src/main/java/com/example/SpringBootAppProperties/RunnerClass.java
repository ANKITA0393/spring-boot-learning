package com.example.SpringBootAppProperties;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerClass implements CommandLineRunner{

    private PaymentGateway paymentGateway;

    public RunnerClass(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void run(String... args) throws Exception {
        paymentGateway.print();
    }
}
