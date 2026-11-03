package com.example.SpringBootAppProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppPropertiesApplication.class, args);

//        PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//        paymentGateway.print();
	}
}
