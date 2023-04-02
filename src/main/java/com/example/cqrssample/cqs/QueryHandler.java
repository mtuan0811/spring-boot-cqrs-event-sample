package com.example.cqrssample.cqs;

public interface QueryHandler <R, C extends Query<R>>{
    R handle(C query);
}
