package org.practice;

import org.practice.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired  //field injection(type of dependency injection)
    private PaymentService paymentService;

    //@Autowired
    //public OrderService(@Qualifier("cp") PaymentService paymentService){
    public OrderService(@Qualifier("cardPayment") PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}


