package com.alibaba.asset.event;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventApplication {
    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(EventApplication.class, args);
        context.publishEvent(new MyApplicationEvent(new Object()));
        context.stop();
        context.close();
    }
}
