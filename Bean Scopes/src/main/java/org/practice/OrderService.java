package org.practice;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class OrderService {

    public OrderService(){
        System.out.println("OrderService created");
    }

    public void placeOrder(){
        System.out.println("Order Placed");
    }
}
