package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotification;
import org.example.notification.SmsService;

public class OrderService {
   NotificationService notification;
   public OrderService(NotificationService notification){
       this.notification = notification;
   }

   public OrderService(){

   }
    public void placeOrder(){
        System.out.println("Order Placed");
//        actual bussiness logic
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
