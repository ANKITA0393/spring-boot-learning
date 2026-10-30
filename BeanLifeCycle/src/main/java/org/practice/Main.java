package org.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String [] args) {
        //ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  //I. IoC container start II. Read Configurations
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);  //I. IoC container start II. Read Configurations


//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        UserService userService = context.getBean(UserService.class);
//        userService.setBeanName("userBean2");  //this name is not the IoC container bean, it just called the method and printed it

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(2)) ;

        context.close();        //Detroys the bean as in step 9
    }
}

// VIII. Bean is ready to use