package org.example.notification;

public class EmailService implements NotificationService{
    @Override
    public void sendNotification(){
//        actual notification
        System.out.println("Email notification sent");
    }
}
