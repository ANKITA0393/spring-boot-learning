package org.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private PaymentService paymentService;      //Field injection

        public void placeOrder(){
            paymentService.pay();
            //call here instead if calling in PaymentService
            getDetails();
            System.out.println("Order placed");
        }

        public void getDetails(){
        System.out.println("Order Details");
    }
    }
