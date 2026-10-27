package org.practice;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class PaymentService {

    public PaymentService() {
        System.out.println("PaymentService created");
    }

    public void pay(){
        System.out.println("Payment succesful");
    }
}
