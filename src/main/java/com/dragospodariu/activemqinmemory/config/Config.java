package com.dragospodariu.activemqinmemory.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Topic;

@EnableJms
@Configuration
public class Config {

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("inmemory.topic");
    }
}