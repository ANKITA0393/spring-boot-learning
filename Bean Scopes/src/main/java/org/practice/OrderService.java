package org.practice;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
 @Lazy       //creates object only when called
public class OrderService {
    PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}
