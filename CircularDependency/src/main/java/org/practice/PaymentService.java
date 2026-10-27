package org.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

//    @Autowired
//    OrderService orderService;      //Field injection

    public void pay(){
        System.out.println("Payment done");
        //not its responsibility
        //orderService.getDetails();
    }
}
