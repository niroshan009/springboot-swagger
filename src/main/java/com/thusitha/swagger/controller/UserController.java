package com.thusitha.swagger.controller;

import com.thusitha.swagger.services.PersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Api("User Controller")
public class UserController {

    @Autowired
    PersonService personService;


    @ApiOperation(value = "get number",notes = "get  static number three ")
    @GetMapping(value = "/get")
    public String getIntValue(){
        return "three";

    }
}
