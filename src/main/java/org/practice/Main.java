package org.practice;


import org.practice.Notification.EmailService;
import org.practice.Notification.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService notification = new EmailService();
        OrderService order = new OrderService(notification);
//       OrderService order = new OrderService();
//       order.setNotification(notification);
        order.placeOrder();
    }
}


/*
 * INVERSION OF CONTROL (IoC)
 * A design principle in which control over object creation
 * and application flow is delegated to an external framework,
 * container, or component rather than being handled entirely
 * by the application code.
 */

/*
 * RELATIONSHIP BETWEEN IoC AND DI
 * IoC is a design principle.
 * Dependency Injection (DI) is one technique used to achieve IoC.
 */