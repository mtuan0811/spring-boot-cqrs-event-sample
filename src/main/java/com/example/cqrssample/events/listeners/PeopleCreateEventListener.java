package com.example.cqrssample.events.listeners;

import com.example.cqrssample.db.PeopleDb;
import com.example.cqrssample.domain.CreatePeopleEvent;
import com.example.cqrssample.domain.People;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PeopleCreateEventListener {
    @EventListener
    public void doorBellEventListener(CreatePeopleEvent createPeopleEvent) throws InterruptedException {
        System.out.println("listener event");
        System.out.println(createPeopleEvent.getName());
        PeopleDb.repPeoples.add(new People(createPeopleEvent.getName()));
    }
}
