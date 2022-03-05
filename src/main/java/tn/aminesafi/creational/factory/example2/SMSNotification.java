package tn.aminesafi.creational.factory.example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        log.info("Sending an SMS notification");
    }
}
