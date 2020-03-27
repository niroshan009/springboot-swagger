package com.thusitha.swagger.services;

import com.thusitha.swagger.model.Person;
import org.springframework.stereotype.Service;

@Service

public class PersonService {

    /**
     *This method saves the person
     *
     * @param person object is required
     *
     *
     * @throws throw the exception
     *
     */

    public Person save(Person person)
    {
        return person;
    }
}
