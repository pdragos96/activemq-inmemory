package com.dragospodariu.activemqinmemory.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "inmemory.queue")
    public void listener(String message) {
        System.out.println("First consumer received the following message: " + message);
    }
}