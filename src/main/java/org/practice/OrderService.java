package org.practice;

import org.practice.Notification.EmailService;
import org.practice.Notification.NotificationService;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification){  //Constructor Injection
        this.notification = notification;
    }

//    public void setNotification(NotificationService notification) {   //Setter Injection
//        this.notification = notification;
//    }

    public OrderService(){}

    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}

/*
 * Initially, OrderService creates its own EmailService dependency.
 * This creates tight coupling between the two classes and makes
 * switching notification types more difficult.
 */

/*
 * Using an interface such as NotificationService makes it possible
 * to work with different notification implementations.
 *
 * However, if OrderService creates the implementation itself,
 * it is still responsible for both order processing and dependency
 * creation.
 */

/*
 * Instead of creating the notification dependency inside
 * OrderService, pass it through the constructor.
 *
 * This allows the calling code to decide which implementation
 * to provide without changing the order-processing logic.
 */

/*
 * DEPENDENCY INJECTION (DI)
 * OrderService receives its NotificationService dependency
 * from outside the class instead of creating it itself.
 */