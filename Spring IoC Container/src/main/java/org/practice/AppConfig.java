package org.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // used to tell that the class is configuration class, marks this class as a source of bean definitions and configuration.
@ComponentScan  //
public class AppConfig {

    @Bean
    public User createUser(){
        return new User("Ankita", 22);
    }

//    @Bean
//    public PaymentService createCardPayment(){
//        return new CardPayment();
//    }
//     can create a bean if no @Component annotation is present on any class
//    @Bean
//    public OrderService createOrderService(PaymentService paymentService){
//        return new OrderService(paymentService);
//    }
}

