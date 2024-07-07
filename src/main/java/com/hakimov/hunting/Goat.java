package com.hakimov.hunting;

public class Goat extends Animal{

    public Goat(String name){
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    @Override
    public String sayBeforeDeath() { return "Бееее!"; }
}
