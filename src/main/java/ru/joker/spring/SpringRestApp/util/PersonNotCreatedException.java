package ru.joker.spring.SpringRestApp.util;

public class PersonNotCreatedException extends RuntimeException{

    public PersonNotCreatedException(String msg) {
        super(msg);
    }
}
