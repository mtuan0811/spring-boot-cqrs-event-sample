package com.example.cqrssample.events;

import com.example.cqrssample.domain.CreatePeopleEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class PeopleEventSource {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void createPeopleEvent(String name) {
        applicationEventPublisher.publishEvent(new CreatePeopleEvent(this, name));
    }
}
