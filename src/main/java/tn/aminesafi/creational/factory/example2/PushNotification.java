package tn.aminesafi.creational.factory.example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PushNotification implements Notification {

    @Override
    public void notifyUser() {
        log.info("Sending a Push notification");
    }
}