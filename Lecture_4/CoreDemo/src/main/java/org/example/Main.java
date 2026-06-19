package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NotificationService notification = new EmailService(); //variable
//        OrderService order = new OrderService(notification);
        OrderService order = new OrderService();
        order.setNotification(notification);

        order.placeOrder();
    }
}


//a class should ask what it needs and not build everythiing  --> dependency injection

//IOC--> INVERSION OF CONTROL
//IOC and DI Relationship

//IOC IS IDEA OR PRINCIPLE
//DI is approch/Technique to achive IOC


//Loose coupling


//spring frameWork--> ioc container
//IOC container: create objects, manage object , connect object together
//objects-> java code
//spring IOC container --> Beans



