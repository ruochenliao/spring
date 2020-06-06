package com.alibaba.asset.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventHandler {

    @EventListener
    public void getEvent(MyApplicationEvent event){
        System.out.println("receive message " + event.getClass());
    }
}
