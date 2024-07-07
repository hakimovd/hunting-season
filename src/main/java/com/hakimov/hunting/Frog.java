package com.hakimov.hunting;

public class Frog extends Animal {

    public Frog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String sayBeforeDeath() { return "Кря кря!"; }
}
