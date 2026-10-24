## Topics Covered

### Inversion of Control (IoC)
- IoC is a design principle that delegates control over object creation and other responsibilities to an external component or framework.

### Dependency Injection (DI)
- DI is a technique used to achieve IoC.
- A class receives its dependencies from outside instead of creating them itself.
- DI helps reduce tight coupling between classes.

### Constructor Injection
- Dependencies are passed through a class constructor.
- Practised injecting a `NotificationService` dependency into `OrderService`.

### Setter Injection
- Dependencies can also be supplied through setter methods.
- Explored setter injection as an alternative to constructor injection.

### Programming Against an Interface
- `NotificationService` defines the notification behaviour.
- `EmailService`, `SmsService`, and `PopUpNotificationService` provide different implementations.

## Hands-on Example

Created an order-processing example in which `OrderService` uses a notification service to send a notification when an order is placed.

