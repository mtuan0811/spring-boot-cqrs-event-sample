package com.example.cqrssample.domain;

import lombok.Getter;


@Getter
public class CreatePeopleEvent extends Event {
    private String name;
    public CreatePeopleEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
}
