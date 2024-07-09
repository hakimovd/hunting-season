package com.hakimov.hunting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("goat")
public class Goat extends Animal{

    public Goat(@Value("${goat.name}")String name){
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    @Override
    public String sayBeforeDeath() { return "Бееее!"; }
}
