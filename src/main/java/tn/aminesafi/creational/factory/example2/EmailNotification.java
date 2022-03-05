package tn.aminesafi.creational.factory.example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        log.info("Sending an EMAIL notification");
    }
}