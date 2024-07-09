package com.hakimov.hunting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Frog")
public class Frog extends Animal {

    public Frog(@Value("${frog.name}")String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String sayBeforeDeath() { return "Кря кря!"; }
}
