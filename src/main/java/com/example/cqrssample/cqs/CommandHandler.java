package com.example.cqrssample.cqs;

public interface CommandHandler<R, C extends Command<R>> {
    R handle(C command);
}
