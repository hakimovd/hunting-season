package com.hakimov.hunting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Hunter {
    private Animal currentAnimal;

    @Autowired
    public void setCurrentAnimal (@Qualifier("gosse")Animal currentAnimal) {
        this.currentAnimal = currentAnimal;
    }

    public  void killAnimal() {
        System.out.println("Стреляю в " + currentAnimal.getName() + "\nПопал!\n"+ currentAnimal.sayBeforeDeath());
    }

}
