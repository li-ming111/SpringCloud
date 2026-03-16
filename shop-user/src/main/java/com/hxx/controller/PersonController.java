package com.hxx.controller;

import com.hxx.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    Person person;

    @GetMapping
    public String show(){
        return person.toString();
    }
}

























