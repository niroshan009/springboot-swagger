package com.thusitha.swagger.controller;

import com.thusitha.swagger.model.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(description = "Hello controller for external")
@RestController
@RequestMapping("greeting")
public class HelloController {

    @ApiOperation(value = "get greeting" , notes = "get greetings from the user")
    @GetMapping(value = "/getGreeting")
    public String getGreetings() {
        return "Hello World";
    }


    @ApiOperation(value = "get greeting by name" , notes = "get greetings for the user with names")
    @GetMapping(value = "/getGreetings")
    public String greetUser(@RequestParam("name") String name){
        return "Greeting from "+ name;
    }

    @ApiOperation(value = "save user" , notes = "post user to the application")
    @PostMapping(value = "/savePerson")
    public Person savePerson(@RequestBody Person person){
        int rand = (int)(Math.random() * 10) +2;
        person.setId(rand);
        return person;
    }


}
