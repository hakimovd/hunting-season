package com.hakimov.hunting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("gosse")
public class Gosse extends Animal{

    public Gosse(@Value("${gosse.name}")String name){
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String sayBeforeDeath() { return "Кря кря!"; }
}
