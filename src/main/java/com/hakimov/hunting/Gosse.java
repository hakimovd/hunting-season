package com.hakimov.hunting;

public class Gosse extends Animal{

    public Gosse(String name){
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String sayBeforeDeath() { return "Кря кря!"; }
}
