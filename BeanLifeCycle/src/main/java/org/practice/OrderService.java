package org.practice;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {    //V. Dependencies are injected
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        System.out.println("Order placed");
        paymentService.pay();
    }
}
