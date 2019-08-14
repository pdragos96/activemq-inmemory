package com.dragospodariu.activemqinmemory.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerTwo {

    @JmsListener(destination = "inmemory.topic")
    public void listener(String message) {
        System.out.println("Second consumer received the following message: " + message);
    }
}
