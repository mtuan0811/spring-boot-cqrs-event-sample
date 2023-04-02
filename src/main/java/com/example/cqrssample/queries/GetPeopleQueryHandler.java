package com.example.cqrssample.queries;

import com.example.cqrssample.cqs.QueryHandler;
import com.example.cqrssample.db.PeopleDb;
import org.springframework.stereotype.Component;

@Component
public class GetPeopleQueryHandler implements QueryHandler<GetPeopleQueryResult, GetPeopleQuery> {
    @Override
    public GetPeopleQueryResult handle(GetPeopleQuery query) {
        return new GetPeopleQueryResult(PeopleDb.repPeoples);
    }
}
