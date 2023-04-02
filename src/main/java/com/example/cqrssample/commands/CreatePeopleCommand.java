package com.example.cqrssample.commands;

import com.example.cqrssample.cqs.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreatePeopleCommand implements Command<CreatePeopleCommandResult> {
    private String name;
}
