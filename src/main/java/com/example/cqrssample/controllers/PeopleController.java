package com.example.cqrssample.controllers;

import com.example.cqrssample.commands.CreatePeopleCommand;
import com.example.cqrssample.commands.CreatePeopleCommandResult;
import com.example.cqrssample.cqs.Bus;
import com.example.cqrssample.queries.GetPeopleQuery;
import com.example.cqrssample.queries.GetPeopleQueryResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PeopleController {
    private final Bus bus;

    @PostMapping("/create")
    public ResponseEntity<CreatePeopleCommandResult> createPeople(@RequestBody CreatePeopleCommand command) {
        return ok(bus.executeCommand(command));
    }

    @GetMapping("/getPeople")
    public ResponseEntity<GetPeopleQueryResult> createPeople() {
        return ok(bus.executeQuery(new GetPeopleQuery()));
    }
}
