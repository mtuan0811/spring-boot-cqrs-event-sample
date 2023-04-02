package com.example.cqrssample.queries;

import com.example.cqrssample.domain.People;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GetPeopleQueryResult {
    private ArrayList<People> peoples;
}
