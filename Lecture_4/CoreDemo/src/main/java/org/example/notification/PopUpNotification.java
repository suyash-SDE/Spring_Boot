package org.example.notification;

public class PopUpNotification implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Popup notification sent");
    }
}
