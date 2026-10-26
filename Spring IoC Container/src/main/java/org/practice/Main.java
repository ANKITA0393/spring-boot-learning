package org.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        PaymentService service = new PaymentService();
//        OrderService order = new OrderService(service);
//        order.placeOrder();

        // ApplicationContext is an interface that provides access to the Spring IoC container, which manages Spring beans and their dependencies.

        // AnnotationConfigApplicationContext: Creates and starts the Spring IoC container using annotation-based configuration.
        // AppConfig provides the configuration rules Spring uses to discover and register beans.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);  //Retrieves the Spring-managed OrderService bean from the container.
        order.placeOrder();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();

//        User user = context.getBean(User.class);
//        System.out.println(user.getName());
//    }
    }
}