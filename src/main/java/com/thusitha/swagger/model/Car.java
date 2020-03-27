package com.thusitha.swagger.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {


    Engine engine;


    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
    }


    void driving(){
        System.out.println("dribing  a"+ engine.getNumOvVal() + " car");
    }
}
