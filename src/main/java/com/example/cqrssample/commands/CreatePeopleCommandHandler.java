package com.example.cqrssample.commands;

import com.example.cqrssample.cqs.CommandHandler;
import com.example.cqrssample.db.PeopleDb;
import com.example.cqrssample.domain.People;
import com.example.cqrssample.events.PeopleEventSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePeopleCommandHandler implements CommandHandler<CreatePeopleCommandResult, CreatePeopleCommand> {
    @Autowired
    PeopleEventSource eventSource;
    @Override
    public CreatePeopleCommandResult handle(CreatePeopleCommand command) {
        People people = new People(command.getName());
        PeopleDb.peoples.add(people);
        eventSource.createPeopleEvent(command.getName());
        return new CreatePeopleCommandResult(command.getName());
    }
}
