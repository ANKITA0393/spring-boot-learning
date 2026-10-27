package org.practice;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    OrderService orderService;

    public PaymentService(OrderService orderService){       //circular dependency is occuring due to constructor
        this.orderService = orderService;
    }

    public void pay(){
        System.out.println("Payment done");
        orderService.getDetails();
    }
}
