package tn.aminesafi.creational.factory.example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NotificationFactory {
    public Notification createNotification(String channel) {
        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                log.error("Unknown channel [{}]", channel);
                throw new IllegalArgumentException("Unknown channel");
        }
    }
}